package testcases_mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page_mail.HomePages;
import page_mail.LoginPage;
import factory.Browserfactory;
import factory.DataProviderFactory;

public class VerifyLoginpage 
{

	WebDriver driver;
	
	@Test
	public void verifylogin() throws Exception 
	{		
			driver=Browserfactory.getbrowser("chrome");
			
			Thread.sleep(6000);
								
			driver.get(DataProviderFactory.getconfig().getApplicationURL());
			
			Thread.sleep(6000);
						
			HomePages pag=PageFactory.initElements(driver, HomePages.class);
		
			pag.homepages_loginbutton();
			
			Thread.sleep(6000);
			
			LoginPage log=PageFactory.initElements(driver, LoginPage.class);

			log.clickloginbutton(DataProviderFactory.getexcel().getdata(0, 0, 0),DataProviderFactory.getexcel().getdata(0, 0, 1));
							
			Thread.sleep(6000);
			
			Browserfactory.closebrowser(driver);
					


	}
	
}
