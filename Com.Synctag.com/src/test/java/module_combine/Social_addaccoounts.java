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
import pages_Socail.Social_AddAcount;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class Social_addaccoounts 

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
			
			Social_AddAcount soc =PageFactory.initElements(driver, Social_AddAcount.class);
			Thread.sleep(6000);
			soc.facebooklogin(DataProviderFactory.getexcel().getdata(2, 0, 0), DataProviderFactory.getexcel().getdata(2, 0, 1));
			test.log(LogStatus.PASS, "---------------- FaceBook Account Added successfully -------------------");			
			Thread.sleep(6000);
			soc.twitterlogin(DataProviderFactory.getexcel().getdata(2, 1, 0), DataProviderFactory.getexcel().getdata(2, 1, 1));
			test.log(LogStatus.PASS, " -----------------Twitter Account added successfully ------------------------");
			Thread.sleep(6000);
			soc.instagram(DataProviderFactory.getexcel().getdata(2, 2, 0), DataProviderFactory.getexcel().getdata(2, 2, 1));
			test.log(LogStatus.PASS, "------------- Instagram Account added successfully ----------------------");
			Thread.sleep(6000);
			soc.linkedin(DataProviderFactory.getexcel().getdata(2, 3, 0), DataProviderFactory.getexcel().getdata(2, 3, 1));
			test.log(LogStatus.PASS, "--------------- LinkedIn Account added successfully ---------------------");
			Thread.sleep(6000);
		//	soc.click_home();
			test.log(LogStatus.INFO, "------------------ All the Home Feeds Loaded Successfully --------------------");		
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
