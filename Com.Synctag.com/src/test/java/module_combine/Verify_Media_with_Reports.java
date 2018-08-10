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
import pages_media.Media_pages;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class Verify_Media_with_Reports 
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
		
		test = extent.createTest("Synctag social", "This is social user mode reports");
	    	
		
		driver=Browserfactory.getbrowser("chrome");
		test.log(Status.PASS, "****** Browser Opened Successfully *******");
		
		driver.get(DataProviderFactory.getconfig().getApplicationURL());
		test.log(Status.INFO, " ******* URL Passed succesfully *********");
		Thread.sleep(6000);
		
	}
	
	@Test 
	public void verify_Media_account() throws Exception 
	{						
		
			HomePages pag=PageFactory.initElements(driver, HomePages.class);
			pag.homepages_loginbutton();
						
			 //Login to synctag Account
			Thread.sleep(6000);
			LoginPage log=PageFactory.initElements(driver, LoginPage.class);
			Thread.sleep(5000);			
			log.clickloginbutton(DataProviderFactory.getexcel().getdata(0, 0, 0),DataProviderFactory.getexcel().getdata(0, 0, 1));	
			
			test.log(Status.PASS, " ************ Synctag Account logged Successfully *************");		
						
			Thread.sleep(6000);
			
			Media_pages pge=PageFactory.initElements(driver, Media_pages.class);
			pge.moving_medial_module();
			test.log(Status.INFO, "------- Media Module are moved successfully -----------");
			
			Thread.sleep(6000);
			pge.add_media_Dailymotion_acount(DataProviderFactory.getexcel().getdata("Media", 1, 0),DataProviderFactory.getexcel().getdata("Media", 1, 1) );
			Thread.sleep(6000);
			test.log(Status.PASS, "------------ DailyMotions Login successfully -----------------------");
			pge.add_media_Vimeo_acount(DataProviderFactory.getexcel().getdata("Media", 2, 0), DataProviderFactory.getexcel().getdata("Media", 2, 1));
			Thread.sleep(6000);			
			test.log(Status.PASS, "-------------- Vimeo Login Successfully -----------------");
			
			//pge.add_media_souncloud_acount(DataProviderFactory.getexcel().getdata("Media", 3, 0), DataProviderFactory.getexcel().getdata("Media", 3, 1));
			//Thread.sleep(6000);
			
			pge.Home_Favourite();
			test.log(Status.INFO, "-------------- Home Page is moved successfully ---------------");
			test.log(Status.INFO, "----------------- Favourite page is move successfully --------------------");
			
			
			Thread.sleep(6000);	
	}
	
	
	
	@AfterMethod
	public void closeApplicationbrwoser()
	{
		
		
		extent.flush();
		
		Browserfactory.closebrowser(driver);
		
		
	}
	
}
