package testcase_After_account_added;

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
import pages_Socail.Xplorer;
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
	public void socialsynctag() 
	{
		
		
			try {
				
				HomePages pag=PageFactory.initElements(driver, HomePages.class);
				pag.homepages_loginbutton();
						
				 //Login to synctag Account
				
				Thread.sleep(2000);
				LoginPage log=PageFactory.initElements(driver, LoginPage.class);
				Thread.sleep(5000);			
				log.clickloginbutton(DataProviderFactory.getexcel().getdata(0, 0, 0),DataProviderFactory.getexcel().getdata(0, 0, 1));
				test.log(LogStatus.PASS, "----------- Synctag Login successfully ------------------");
				
				Thread.sleep(10000);
			} 
			catch (Exception e) 
			
			{
				System.out.println("The Home page Exception is :" +e.getMessage());
				
			}
			
			// Home Feeds 
			
			try {
				Social_Filter fil=PageFactory.initElements(driver, Social_Filter.class );
				
				fil.timeline_to_home();		
						
				fil.click_filters();
				
				Thread.sleep(10000);
				Social_AddAcount socil=PageFactory.initElements(driver, Social_AddAcount.class );
				
				socil.click_home_Fbfilter();
				fil.click_filters();
				
				socil.click_home_twetfilter();
				fil.click_filters();
				
				socil.click_home_synclogo();
				
			}
			catch (Exception e)
			{
				System.out.println("The Home feed Exception is :"+e.getMessage());		
				
			}
			
			
			// Friends and Followers 
			
			try {
				
				Friends_And_Followers frnd_follow=PageFactory.initElements(driver, Friends_And_Followers.class );
				frnd_follow.click_friends_Followers_Fb();
				Thread.sleep(5000);
				frnd_follow.friends_and_followers_twitter();
				Thread.sleep(5000);
				frnd_follow.twitter_syncpage_filter();
				test.log(LogStatus.PASS, "----------- Synctag Friends and followers  working fine and Test cases Executed  successfully ------------------");
				
				
			} 
			catch (Exception e)
			{
				System.out.println("The Frineds and follower Exception is :"+e.getMessage());	
				
			}
			
			
			// Time Line for User mode
			
			try 
			{
				Time_Line_Feeds timeline=PageFactory.initElements(driver, Time_Line_Feeds.class);
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
 
				test.log(LogStatus.PASS, "----------- Synctag TimeLine working fine and Test cases Executed  successfully  ------------------");
				
				
			}
			catch (Exception e) 
			{
				System.out.println("The TimeLine Exception is :"+e.getMessage());
			}
			
				
			// Queue Menu 
			
			try {
				Queue_Menu ques=PageFactory.initElements(driver, Queue_Menu.class);
				
				ques.click_Queuemenu();
				Thread.sleep(5000);
				
				ques.queue_facebook();
				Thread.sleep(5000);
				
				ques.queue_twitter();
				Thread.sleep(5000);
				
				test.log(LogStatus.PASS, "----------- Synctag Queue working fine and Test cases Executed  successfully ------------------");
				
			}
			catch (Exception e) 
			{
				
				System.out.println("The Queue Exception is :"+e.getMessage());
				
			}
			
			// MailBox 
			try {
				
				MailBox mailbox=PageFactory.initElements(driver, MailBox.class);
				mailbox.mailbox();
				Thread.sleep(5000);
				test.log(LogStatus.PASS, "----------- Synctag MailBox Functionality working fine and Test cases Executed  successfully ------------------");
			}
			catch (Exception e) 
			{
				System.out.println("The MailBox Excetion is :"+e.getMessage());
				
			}
			
			//Mentions	
			
			try
			{
				
				Mentions mention=PageFactory.initElements(driver, Mentions.class);
				mention.mentionfunction();
				test.log(LogStatus.PASS, "----------- Synctag Mentions working fine and Test cases Executed  successfully ------------------");
				
			}
			catch (Exception e) 
			{
				System.out.println("The Mention Exceptio is :"+e.getMessage());
			}
			
			//xplorer
						
			try {
				
				Xplorer xplor=PageFactory.initElements(driver, Xplorer.class);
				xplor.xplorer_function();
				
			} 
			catch (Exception e)
			{
				System.out.println("The Xlorer Exception is :"+e.getMessage());
			}
				
			//Archive
			
			try 
			{
			
				Archive arch=PageFactory.initElements(driver, Archive.class);
				arch.archivefunctions();
				test.log(LogStatus.PASS, "----------- Synctag Archive working fine and Test cases Executed  successfully ------------------");
				
			} 
			catch (Exception e) 
			{
				System.out.println("The Archive Exception is :"+e.getMessage());
			}
			
			
	}

	@AfterMethod
	public void closeApplicationbrwoser()
	{
		extent.endTest(test);
		
		extent.flush();
		
		Browserfactory.closebrowser(driver);
		
		
	}
	
	
	
}
