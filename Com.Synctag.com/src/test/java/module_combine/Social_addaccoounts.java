package module_combine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import page_mail.HomePages;
import page_mail.LoginPage;
import pages_Socail_Usermode.Social_AddAcount;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class Social_addaccoounts 

{

	WebDriver driver;
	
	ExtentHtmlReporter reporter;
	
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeMethod
	public void setUP() throws Exception
	{
		reporter = new ExtentHtmlReporter("./Reports/Social_reports.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		test = extent.createTest("Synctag social", "Social Add account ");
	    
			
		driver=Browserfactory.getbrowser("chrome");
		test.log(Status.PASS, "****** Browser Opened Successfully *******");
				
		
		driver.manage().deleteAllCookies();
		
		driver.get(DataProviderFactory.getconfig().getApplicationURL());
		test.log(Status.INFO, " ******* URL Passed succesfully *********");
		Thread.sleep(2000);
		
	}
	
	
	@Test
	public void socialsynctag() throws Exception 
	{
		
		
			HomePages pag=PageFactory.initElements(driver, HomePages.class);
			pag.homepages_loginbutton();
					
			 //Login to synctag Account
			
			Thread.sleep(2000);
			LoginPage log=PageFactory.initElements(driver, LoginPage.class);
			Thread.sleep(5000);			
			log.clickloginbutton(DataProviderFactory.getexcel().getdata(0, 0, 0),DataProviderFactory.getexcel().getdata(0, 0, 1));
			test.log(Status.PASS, "----------- Synctag Login successfully ------------------");
			
			Social_AddAcount soc =PageFactory.initElements(driver, Social_AddAcount.class);
			Thread.sleep(6000);
			soc.facebooklogin(DataProviderFactory.getexcel().getdata(2, 0, 0), DataProviderFactory.getexcel().getdata(2, 0, 1));
			test.log(Status.PASS, "---------------- FaceBook Account Added successfully -------------------");			
			Thread.sleep(6000);
			//soc.twitterlogin(DataProviderFactory.getexcel().getdata(2, 1, 0), DataProviderFactory.getexcel().getdata(2, 1, 1));
			//test.log(Status.PASS, " -----------------Twitter Account added successfully ------------------------");
			//Thread.sleep(6000);
			soc.instagram(DataProviderFactory.getexcel().getdata(2, 2, 0), DataProviderFactory.getexcel().getdata(2, 2, 1));
			test.log(Status.PASS, "------------- Instagram Account added successfully ----------------------");
			Thread.sleep(6000);
			soc.linkedin(DataProviderFactory.getexcel().getdata(2, 3, 0), DataProviderFactory.getexcel().getdata(2, 3, 1));
			test.log(Status.PASS, "--------------- LinkedIn Account added successfully ---------------------");
			Thread.sleep(6000);
		//	soc.click_home();
			test.log(Status.INFO, "------------------ All the Home Feeds Loaded Successfully --------------------");		
			Thread.sleep(6000);
	
	}

	@AfterMethod
	public void closeApplicationbrwoser()
	{
		
		
		extent.flush();
		
		Browserfactory.closebrowser(driver);
		
		
	}
	
	
	
}
