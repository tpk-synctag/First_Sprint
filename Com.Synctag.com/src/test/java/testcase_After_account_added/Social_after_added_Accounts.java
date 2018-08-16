package testcase_After_account_added;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import factory.Browserfactory;
import factory.DataProviderFactory;
import page_mail.LoginPage;
import pages_Socail_Usermode.Archive;
import pages_Socail_Usermode.Friends_And_Followers;
import pages_Socail_Usermode.Homefeed;
import pages_Socail_Usermode.MailBox;
import pages_Socail_Usermode.Mentions;
import pages_Socail_Usermode.Queue_Menu;
import pages_Socail_Usermode.Time_Line_Feeds;
import pages_Socail_Usermode.Xplorer;
import utility.Screenshot;


public class Social_after_added_Accounts 

{

	WebDriver driver;
	
	ExtentHtmlReporter reporter;
	
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeClass
	public void setUP() throws Exception
	{
		reporter = new ExtentHtmlReporter("./Reports/Social_reports.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		test = extent.createTest("Synctag Setup", "This is setup parts in synctag");
	    		 		
		driver=Browserfactory.getbrowser("chrome");
		test.log(Status.INFO, "--------------------- Browser launched successfully --------------------------");
		
		driver.get(DataProviderFactory.getconfig().getApplicationURL());
		
		
		
		test.log(Status.INFO, " ******* URL Passed succesfully *********");
		
		
	}
	
	
	
		@Test (priority=1)
		public void logintosynctag()
		{
			try {
								
				LoginPage log=PageFactory.initElements(driver, LoginPage.class);
				
				log.clickloginbutton(DataProviderFactory.getexcel().getdata(0, 0, 0),DataProviderFactory.getexcel().getdata(0, 0, 1));
				test.log(Status.PASS, "----------- Synctag Login successfully ------------------");
				
				Thread.sleep(5000);
			} 
			catch (Exception e) 
			
			{
				System.out.println("The Home page Exception is :" +e.getMessage());
				
			}
			
		}

	 
		@Test(priority=2)
		public void homefeeds()
		{
			try {
				Homefeed home=PageFactory.initElements(driver, Homefeed.class);
				home.click_home_synclogo();
				home.click_filters();
				test.log(Status.PASS, "----------- Home Feeds Sync social  Test cases Executed successfully ------------------");
				
				home.click_home_Fbfilter();
				home.click_filters();
				test.log(Status.PASS, "----------- Home Feeds Facebook Test cases Executed successfully ------------------");
				
				home.click_home_twetfilter();
				home.click_filters();
				test.log(Status.PASS, "----------- Home Feeds Twitter Test cases Executed successfully ------------------");
				
			}
			
			catch (Exception e1)
			{
				System.out.println(e1.getMessage());
			}
			
		}
		
		
						
		@Test(priority=4)
		public void timeline()
		{
			 try {
					Time_Line_Feeds timeline=PageFactory.initElements(driver, Time_Line_Feeds.class);
					timeline.Click_timeline_sync();
					Thread.sleep(5000);
					timeline.filter_time_line();
					test.log(Status.PASS, "----------- TimeLine Sync social Test cases Executed  successfully ------------------");
					
					timeline.timeline_facebook();
					timeline.filter_time_line();
					test.log(Status.PASS, "----------- TimeLine Facebook Test cases Executed  successfully ------------------");
					
					timeline.timeline_twitter();
					timeline.filter_time_line();	
					test.log(Status.PASS, "----------- TimeLine Twitter Test cases Executed  successfully ------------------");
					
					timeline.timeline_instagram();
					timeline.filter_instgram_time_line();
					test.log(Status.PASS, "----------- TimeLine Instagram Test cases Executed  successfully ------------------");
					
				} 
				catch (Exception e)
				{
				
					System.out.println("The Time Line Exception is :"+e.getMessage());
				}
			
		}
		 
 
		@Test(priority=3)
		public void friendsandfollowers()
		{
			try {
				
				Friends_And_Followers frnd_follow=PageFactory.initElements(driver, Friends_And_Followers.class );
				frnd_follow.click_friends_Followers_Fb();
				test.log(Status.PASS, "----------- Facebook Friends & followers  working fine and Test cases Executed  successfully ------------------");
				frnd_follow.friends_and_followers_twitter();
				test.log(Status.PASS, "----------- Twitter Friends and followers  working fine and Test cases Executed  successfully ------------------");
				frnd_follow.twitter_syncpage_filter();
				Thread.sleep(5000);
				test.log(Status.PASS, "----------- Twitter Friends and followers Sync page Filter  working fine and Test cases Executed  successfully ------------------");
				
				
			} 
			catch (Exception e)
			{
				System.out.println("The Frineds and follower Exception is :"+e.getMessage());	
				
			}
					
			
		}
		
		@Test(priority=5)
		public void queue()
		{
			try {
				Queue_Menu ques=PageFactory.initElements(driver, Queue_Menu.class);
								
				ques.queue_facebook();
				test.log(Status.PASS, "----------- FaceBook Queue working fine and Test cases Executed  successfully ------------------");
				ques.queue_twitter();
				Thread.sleep(5000);
				test.log(Status.PASS, "----------- Twitter Queue working fine and Test cases Executed  successfully ------------------");
				
			}
			catch (Exception e) 
			{
				
				System.out.println("The Queue Exception is :"+e.getMessage());
				
			}
			
		} 
		

		@Test (priority=6)		
		public void mailbox()
		{
			try {
				
				MailBox mailbox=PageFactory.initElements(driver, MailBox.class);
				mailbox.mailbox();
				Thread.sleep(5000);
				test.log(Status.PASS, "-----------  MailBox Functionality working fine and Test cases Executed  successfully ------------------");
			}
			catch (Exception e) 
			{
				System.out.println("The MailBox Excetion is :"+e.getMessage());
				
			}
			
		}  
		 
		 
		@Test (priority=7)
		public void mentions()
		{
			try
			{
				
				Mentions mention=PageFactory.initElements(driver, Mentions.class);
				mention.mentionfunction();
				Thread.sleep(5000);
				test.log(Status.PASS, "-----------  Mentions working fine and Test cases Executed  successfully ------------------");
				
			}
			catch (Exception e) 
			{
				System.out.println("The Mention Exceptio is :"+e.getMessage());
			}
			
			
		}
		 
		@Test (priority=8)
		public void xlporer()
		{
			try {
				
				Xplorer xplor=PageFactory.initElements(driver, Xplorer.class);
				xplor.xplorer_function();
				test.log(Status.PASS, "-----------  Xplorer working fine and Test cases Executed  successfully ------------------");
				
			} 
			catch (Exception e)
			{
				System.out.println("The Xlorer Exception is :"+e.getMessage());
			}
			
		}   
	 	
		@Test (priority=9)
		public void archive()
		{
			try 
			{
			
				Archive arch=PageFactory.initElements(driver, Archive.class);
				arch.archivefunctions();
				test.log(Status.PASS, "-----------  Archive working fine and Test cases Executed  successfully ------------------");
				
			} 
			catch (Exception e) 
			{
				System.out.println("The Archive Exception is :"+e.getMessage());
			}
			
		}
		 
 
	@AfterTest	
	public void failedscrenshot(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screnpath=Screenshot.capturescreenshot(driver, result.getName());
			
			test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screnpath).build());
			
			test.pass(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screnpath).build());
			
		}
				
	}
	 
		
	@AfterClass
	public void closeApplicationbrwoser()
	{
		 		
		extent.flush();
		
		Browserfactory.closebrowser(driver);
		
		
	}
	
}
