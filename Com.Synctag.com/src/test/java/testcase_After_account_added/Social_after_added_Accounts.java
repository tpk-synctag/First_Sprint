package testcase_After_account_added;

import java.util.Queue;

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
import pages_Socail.Archive;
import pages_Socail.Friends_And_Followers;
import pages_Socail.MailBox;
import pages_Socail.Mentions;
import pages_Socail.Queue_Menu;
import pages_Socail.Social_AddAcount;
import pages_Socail.Social_Filter;
import pages_Socail.Time_Line_Feeds;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class Social_after_added_Accounts 

{

	WebDriver driver;
	
	ExtentReports extent;
	
	ExtentTest test;
	
	@BeforeMethod
	public void setUP() throws Exception
	{
		extent = new ExtentReports("./Reports/Social_reports.html", true);
	    test = extent.startTest("This is Mail module testing ");	
		
		driver=Browserfactory.getbrowser("chrome");
		test.log(LogStatus.PASS, "****** Browser Opened Successfully *******");
		
		driver.get(DataProviderFactory.getconfig().getApplicationURL());
		test.log(LogStatus.INFO, " ******* URL Passed succesfully *********");
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
			test.log(LogStatus.PASS, "----------- Synctag Login successfully ------------------");
			
			Thread.sleep(10000);
			
			// Home Feeds 
			
			/*Social_Filter fil=PageFactory.initElements(driver, Social_Filter.class );
			
			fil.timeline_to_home();		
					
			fil.click_filters();
			
			Thread.sleep(10000);
			Social_AddAcount socil=PageFactory.initElements(driver, Social_AddAcount.class );
			
			socil.click_home_Fbfilter();
			fil.click_filters();
			
			socil.click_home_twetfilter();
			fil.click_filters();
			
			socil.click_home_synclogo();*/
			
			
			// Friends and Followers 
			
			/*Friends_And_Followers frnd_follow=PageFactory.initElements(driver, Friends_And_Followers.class );
			frnd_follow.click_friends_Followers();
			Thread.sleep(5000);
			frnd_follow.frineds_and_Followers_facebook();
			Thread.sleep(5000);
			frnd_follow.click_friends_Followers();
			Thread.sleep(9000);
			frnd_follow.friends_and_followers_twitter();
			Thread.sleep(5000);
			frnd_follow.twitter_syncpage_filter();
			Thread.sleep(5000);*/
			
			
			// Time Line for User mode
			
			/*Time_Line_Feeds timeline=PageFactory.initElements(driver, Time_Line_Feeds.class);
			timeline.filter_time_line();
			
			timeline.timeline_facebook();
			timeline.filter_time_line();
			Thread.sleep(5000);
			
			timeline.timeline_twitter();
			timeline.filter_time_line();
			Thread.sleep(5000);
			
			timeline.timeline_instagram();
			timeline.filter_instgram_time_line();
			Thread.sleep(5000);
			*/
				
			// Queue Menu 
			
			/*Queue_Menu ques=PageFactory.initElements(driver, Queue_Menu.class);
			ques.click_Queuemenu();
			Thread.sleep(5000);
			ques.queue_facebook();
			Thread.sleep(5000);
			ques.queue_twitter();
			Thread.sleep(5000);*/
			
			/*MailBox mailbox=PageFactory.initElements(driver, MailBox.class);
			mailbox.mailbox();
			Thread.sleep(5000);
			*/
				
			/*Mentions mention=PageFactory.initElements(driver, Mentions.class);
			mention.mentionfunction();*/
			
			Archive arch=PageFactory.initElements(driver, Archive.class);
			arch.archivefunctions();
			
			
	}

	@AfterMethod
	public void closeApplicationbrwoser()
	{
		extent.endTest(test);
		
		extent.flush();
		
		Browserfactory.closebrowser(driver);
		
		
	}
	
	
	
}
