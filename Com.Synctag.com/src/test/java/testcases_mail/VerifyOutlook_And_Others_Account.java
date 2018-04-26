package testcases_mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_mail.Add_All_Mail_Account_Page;

import page_mail.HomePages;
import page_mail.LoginPage;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class VerifyOutlook_And_Others_Account 
{

	WebDriver driver;
	
	@BeforeMethod
	public void setUP() throws Exception
	{
			
		driver=Browserfactory.getbrowser("chrome");
		driver.get(DataProviderFactory.getconfig().getApplicationURL());
		
		Thread.sleep(6000);
		
	}
	
	@Test 
	public void verify_Outlook_login() throws Exception 
	{											
			HomePages pag=PageFactory.initElements(driver, HomePages.class);
			pag.homepages_loginbutton();
			
			// Login to synctag Account
			Thread.sleep(6000);
			LoginPage log=PageFactory.initElements(driver, LoginPage.class);
			log.clickloginbutton(DataProviderFactory.getexcel().getdata(0, 0, 0),DataProviderFactory.getexcel().getdata(0, 0, 1));
						
			Thread.sleep(6000);
			
			//This is Outlook account 
			Add_All_Mail_Account_Page outlok=PageFactory.initElements(driver, Add_All_Mail_Account_Page.class);
			
			outlok.add_Outlook_Account(DataProviderFactory.getexcel().getdata(1, 0, 0), DataProviderFactory.getexcel().getdata(1, 0, 1));
			Thread.sleep(6000);
			
			// Getting page Title 
			String msg=outlok.getpagetitle();			
			Assert.assertTrue(msg.contains("Synctag"), "This is Invalid PageTitle");				
			System.out.println("The Account Text is : "+ msg);
			Thread.sleep(6000);	
			
			
			// This is OtherAccount
			Add_All_Mail_Account_Page other=PageFactory.initElements(driver, Add_All_Mail_Account_Page.class);
			other.add_Others_Account(DataProviderFactory.getinput().email_usename(), DataProviderFactory.getinput().email_password());
			
			Thread.sleep(6000);	
			
			other.add_Others_Account(DataProviderFactory.getinput().zoho_email_id(), DataProviderFactory.getinput().zoho_password());
			
			
			WebDriverWait wait=new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='col-lg-12 nopadding']/ul/li")));
			
			String msge=driver.getCurrentUrl();
			Assert.assertTrue(msge.contains("mail.synctag.com/#/accounts"), "This is Invalid PageTitle");	
			
			
			
			Thread.sleep(6000);				
				
					
			
						
	}
	
	
	
	@AfterMethod
	public void closeApplicationbrwoser()
	{
		Browserfactory.closebrowser(driver);
		
		
	}
	
}
