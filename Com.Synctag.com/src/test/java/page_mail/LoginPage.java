package page_mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="//*[@id='login_web']") WebElement clicklogin;
	
	@FindBy(id="emailid") WebElement username;
		
	@FindBy(id="password") WebElement password;
	
	@FindBy(xpath="//button[text()='LOGIN']") WebElement loginbutton;
	
	
	public void clickloginbutton(String user,String pass) throws Exception 
	
	{
		clicklogin.click();
		Thread.sleep(3000);		
		username.sendKeys(user);
		Thread.sleep(2000);		
		password.sendKeys(pass);
		Thread.sleep(2000);			
		loginbutton.click();		
	
	}
	
}
