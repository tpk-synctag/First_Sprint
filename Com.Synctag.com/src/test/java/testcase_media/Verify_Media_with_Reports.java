package testcase_media;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import page_mail.LoginPage;
import pages_media.Favourite;
import pages_media.Home_Media;
import pages_media.Media_pages;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class Verify_Media_with_Reports 
{

		WebDriver driver;
	
		ExtentHtmlReporter reporter;
		
		ExtentTest test;
		
		ExtentReports extent;
	
	@BeforeClass
	public void setUP() throws Exception
	{
       reporter = new ExtentHtmlReporter("./MediaReports/media_reports.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		test = extent.createTest("Synctag Media USerMode", "This is Media user mode reports");
		
		driver=Browserfactory.getbrowser("chrome");
		test.log(Status.PASS, "****** Browser Opened Successfully *******");
		
		driver.get(DataProviderFactory.getconfig().getApplicationURL());
		test.log(Status.INFO, " ******* URL Passed succesfully *********");
		Thread.sleep(6000);
		
	}
	
	@Test(priority=1) 
	public void verify_Media_account() throws Exception 
	{						
		
		LoginPage log=PageFactory.initElements(driver, LoginPage.class);
		
		log.clickloginbutton(DataProviderFactory.getexcel().getdata(0, 0, 0),DataProviderFactory.getexcel().getdata(0, 0, 1));
		test.log(Status.PASS, " ************ Synctag Account logged Successfully *************");		
		Thread.sleep(6000);
			
			
	}
	
	@Test(priority=2)
	public void Moving_Media_module()
	{
		try {
				
			Media_pages pge=PageFactory.initElements(driver, Media_pages.class);
			pge.moving_medial_module();
			test.log(Status.INFO, "------- Media Module are moved successfully -----------");
			Thread.sleep(6000);
			
			 
		}  
		catch (Exception e)
		{
			
			System.out.println("The Moving_Media_module Exception is :"+e.getMessage());
			
		}	
		
	}
	 
	@Test(priority=5)
	public void add_vime0_account()
	{
		try {
			
			Media_pages pge=PageFactory.initElements(driver, Media_pages.class);
			pge.add_media_Vimeo_acount(DataProviderFactory.getexcel().getdata("Media", 2, 0), DataProviderFactory.getexcel().getdata("Media", 2, 1));
			Thread.sleep(6000);			
			test.log(Status.PASS, "-------------- Vimeo Login Successfully -----------------");
		} 
		
		catch (Exception e)
		{
			System.out.println("The Vime Account is :"+e.getMessage());
			
		}
		
	}
	
	@Test(priority=4)
	public void add_dailymotions_account()
	{
		
		try {
			
			Media_pages pge=PageFactory.initElements(driver, Media_pages.class);
			pge.add_media_Dailymotion_acount(DataProviderFactory.getexcel().getdata("Media", 1, 0),DataProviderFactory.getexcel().getdata("Media", 1, 1) );
			Thread.sleep(6000);
			test.log(Status.PASS, "------------ DailyMotions Login successfully -----------------------");
					
		}  
		
		catch (Exception e)
		{
		
			System.out.println("The Dailymtions Add Account Exception is :"+e.getMessage());
			
		}
		
		
	}
	/*
	@Test(priority=6)
	public void add_soundcloud_account()
	{
		
		try 
		{
			Media_pages pge=PageFactory.initElements(driver, Media_pages.class);
			pge.add_media_souncloud_acount(DataProviderFactory.getexcel().getdata("Media", 3, 0), DataProviderFactory.getexcel().getdata("Media", 3, 1));
			test.log(Status.PASS, "------------ DailyMotions Login successfully -----------------------");
			Thread.sleep(6000);
		} 
		
		catch (Exception e) 
		{
				System.out.println("The sound clound Exception is :"+e.getMessage());
						
		}
			
	}
	 */
	@Test(priority=3)
	public void add_youtube_account()
	{
		try {
			Media_pages pge=PageFactory.initElements(driver, Media_pages.class);
			pge.add_media_youtube_acount(DataProviderFactory.getexcel().getdata(3, 0, 0), DataProviderFactory.getexcel().getdata(3, 0, 1));
			test.log(Status.PASS, "------------ Youtube Login successfully -----------------------");
			Thread.sleep(6000);
		} 
		catch (Exception e) 
		{
			System.out.println("The Youtube Exception is :"+e.getMessage());
			
		}
		
		
	}
	 
	@Test(priority=7)
	public void UserfeedsFeeds_account()
	{
		
		try {
			
			Home_Media homeuser=PageFactory.initElements(driver, Home_Media.class);
			homeuser.youtube_homefeeds();
			Thread.sleep(6000);
			homeuser.Dailymotions_homefeeds();
			Thread.sleep(6000);
			homeuser.Soundcloud_homefeeds();
			Thread.sleep(6000);
			test.log(Status.PASS, "-------------- Home Feeds loaded successfully ---------------");
		}  
		catch (Exception e) 
		{			
			System.out.println("The USerFeeds Exception is :"+e.getMessage());
					
		}
		 
	}
	
	@Test(priority=8)
	public void Favourite_Feeds()
	{
		
		try {
			Favourite favu=PageFactory.initElements(driver, Favourite.class);
			
			favu.Favourite_youtube_media();
			
			favu.Favourite_Dailymotions_media();
			
			favu.Favourite_Vimeo_media();
			
			favu.Favourite_soundcloud_media();
			test.log(Status.PASS, " -------- --- The Favourite feeds loaded successfully ------------");
			 
		}  
		catch (Exception e) 
		{			
			System.out.println("The Favourite feeds Exception is :"+e.getMessage());
					
		}
		 
	}
	
	
	@AfterClass
	public void closeApplicationbrwoser()
	{
		
		
		extent.flush();
		
		Browserfactory.closebrowser(driver);
		
		
	}
	
}
