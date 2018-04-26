package module_combine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import page_mail.HomePages;
import page_mail.LoginPage;
import pages_media.Media_pages;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class Verify_Media_with_Reports 
{

		WebDriver driver;
	
		ExtentReports extent;
	
		ExtentTest test;
	
	@BeforeMethod
	public void setUP() throws Exception
	{
		extent = new ExtentReports("./Reports/Media_Report.html", true);
	    test = extent.startTest("This is Media module testing ");	
		
		driver=Browserfactory.getbrowser("chrome");
		test.log(LogStatus.PASS, "****** Browser Opened Successfully *******");
		
		driver.get(DataProviderFactory.getconfig().getApplicationURL());
		test.log(LogStatus.INFO, " ******* URL Passed succesfully *********");
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
			
			test.log(LogStatus.PASS, " ************ Synctag Account logged Successfully *************");		
						
			Thread.sleep(6000);
			
			Media_pages pge=PageFactory.initElements(driver, Media_pages.class);
			pge.moving_medial_module();
			test.log(LogStatus.INFO, "------- Media Module are moved successfully -----------");
			
			Thread.sleep(6000);
			pge.add_media_Dailymotion_acount(DataProviderFactory.getexcel().getdata("Media", 1, 0),DataProviderFactory.getexcel().getdata("Media", 1, 1) );
			Thread.sleep(6000);
			test.log(LogStatus.PASS, "------------ DailyMotions Login successfully -----------------------");
			pge.add_media_Vimeo_acount(DataProviderFactory.getexcel().getdata("Media", 2, 0), DataProviderFactory.getexcel().getdata("Media", 2, 1));
			Thread.sleep(6000);			
			test.log(LogStatus.PASS, "-------------- Vimeo Login Successfully -----------------");
			
			//pge.add_media_souncloud_acount(DataProviderFactory.getexcel().getdata("Media", 3, 0), DataProviderFactory.getexcel().getdata("Media", 3, 1));
			//Thread.sleep(6000);
			
			pge.Home_Favourite();
			test.log(LogStatus.INFO, "-------------- Home Page is moved successfully ---------------");
			test.log(LogStatus.INFO, "----------------- Favourite page is move successfully --------------------");
			
			
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
