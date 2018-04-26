package module_combine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import page_mail.Add_All_Mail_Account_Page;

import page_mail.HomePages;
import page_mail.LoginPage;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class Verify_Mails_with_Reports 
{

		WebDriver driver;
	
		ExtentReports extent;
	
		ExtentTest test;
	
	@BeforeMethod
	public void setUP() throws Exception
	{
		extent = new ExtentReports("./Reports/MailReport.html", true);
	    test = extent.startTest("This is Mail module testing ");	
		
		driver=Browserfactory.getbrowser("chrome");
		test.log(LogStatus.PASS, "****** Browser Opened Successfully *******");
		
		driver.get(DataProviderFactory.getconfig().getApplicationURL());
		test.log(LogStatus.INFO, " ******* URL Passed succesfully *********");
		Thread.sleep(6000);
		
	}
	
	@Test 
	public void verify_Outlook_login() throws Exception 
	{						
		
			HomePages pag=PageFactory.initElements(driver, HomePages.class);
			pag.homepages_loginbutton();
			
			
			 //Login to synctag Account
			Thread.sleep(2000);
			LoginPage log=PageFactory.initElements(driver, LoginPage.class);
			Thread.sleep(2000);			
			log.clickloginbutton(DataProviderFactory.getexcel().getdata(0, 0, 0),DataProviderFactory.getexcel().getdata(0, 0, 1));
			test.log(LogStatus.PASS, " ************ Synctag Account login Successfully *************");
							
			Thread.sleep(3000);
			//This is Outlook account 
			Add_All_Mail_Account_Page outlok=PageFactory.initElements(driver, Add_All_Mail_Account_Page.class);
			outlok.add_Outlook_Account(DataProviderFactory.getexcel().getdata(1, 0, 0), DataProviderFactory.getexcel().getdata(1, 0, 1));
			test.log(LogStatus.PASS, " ************ OutLook loggin Successfully *************");
			Thread.sleep(6000);
		
			// Getting page Title 
			String msg=outlok.getpagetitle();
			
			Assert.assertTrue(msg.contains("Synctag"), "This is Invalid PageTitle");				
			System.out.println("The Account Text is : "+ msg);
			Thread.sleep(6000);							
			test.log(LogStatus.INFO, "********* Page Title is verified successfully *********");
			Thread.sleep(6000);
			
			// This is Gmail Account Adding 			
			//outlok.Add_Gmail_accounts(DataProviderFactory.getinput().gmail_user(), DataProviderFactory.getinput().gmail_pass());
			
			//test.log(LogStatus.PASS, "************** Gmail Account is Added Successfully *****************");
				
			//Thread.sleep(6000);
			
			// This is OtherAccount
			Add_All_Mail_Account_Page other=PageFactory.initElements(driver, Add_All_Mail_Account_Page.class);
			other.add_Others_Account(DataProviderFactory.getinput().email_usename(), DataProviderFactory.getinput().email_password());
			
			test.log(LogStatus.INFO,"Synctag account login"+test.addScreenCapture("C:\\Users\\user\\Desktop\\Automation_Testing_Framework\\Com.Synctag.com\\Screenshot\\yahoo.png"));
			test.log(LogStatus.PASS, "********* Yahoo account Login successfully *********");
			Thread.sleep(6000);	
			
			other.add_Others_Account(DataProviderFactory.getinput().zoho_email_id(), DataProviderFactory.getinput().zoho_password());
			
			test.log(LogStatus.INFO,"Synctag account login"+test.addScreenCapture("C:\\Users\\user\\Desktop\\Automation_Testing_Framework\\Com.Synctag.com\\Screenshot\\zohoaccou.png"));
			
			
			test.log(LogStatus.PASS, "********* Zoho Account Login successfully *********");
			
			WebDriverWait wait=new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='col-lg-12 nopadding']/ul/li")));
			
			String msge=driver.getCurrentUrl();
			Assert.assertTrue(msge.contains("mail.synctag.com/#/accounts"), "This is Invalid PageTitle");	
			test.log(LogStatus.INFO, "********* Page Title is verified successfully *********");
						
			Thread.sleep(6000);				
			
			other.click_Inbox();
			test.log(LogStatus.PASS, "*************** Inbox is clicked successfully ***********");
			
			Thread.sleep(6000);	
						
	}
	
	
	
	@AfterMethod
	public void closeApplicationbrwoser()
	{
		extent.endTest(test);
		
		extent.flush();
		
		Browserfactory.closebrowser(driver);
		
		
	}
	
}
