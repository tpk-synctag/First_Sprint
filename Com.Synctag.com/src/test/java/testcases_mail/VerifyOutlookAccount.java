package testcases_mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_mail.Add_All_Mail_Account_Page;

import page_mail.HomePages;
import page_mail.LoginPage;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class VerifyOutlookAccount 
{

	WebDriver driver;
	
	@BeforeMethod
	public void setUP() throws Exception
	{
			
		driver=Browserfactory.getbrowser("chrome");
		Thread.sleep(6000);	
		driver.get(DataProviderFactory.getconfig().getApplicationURL());
		
		Thread.sleep(6000);
		
	}
	
	@Test
	public void verifylogin() throws Exception 
	{		
									
			HomePages pag=PageFactory.initElements(driver, HomePages.class);
		
			pag.homepages_loginbutton();
			
			Thread.sleep(6000);
			
			LoginPage log=PageFactory.initElements(driver, LoginPage.class);

			log.clickloginbutton(DataProviderFactory.getexcel().getdata(0, 0, 0),DataProviderFactory.getexcel().getdata(0, 0, 1));
						
			Thread.sleep(6000);
			
			Add_All_Mail_Account_Page outlok=PageFactory.initElements(driver, Add_All_Mail_Account_Page.class);
				
			outlok.add_Outlook_Account(DataProviderFactory.getexcel().getdata(1, 0, 0), DataProviderFactory.getexcel().getdata(1, 0, 1));
			
			Thread.sleep(6000);
			
			String msg=outlok.getpagetitle();
					
			System.out.println("The Account Text is : "+ msg);
			
			Thread.sleep(6000);			

	}
	
	@AfterMethod
	public void closeApplicationbrwoser()
	{
		
		Browserfactory.closebrowser(driver);
		
		
	}
	
}
