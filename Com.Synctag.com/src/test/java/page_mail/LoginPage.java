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
	
	@FindBy(xpath="//div[@class='container']/div[2]/ul/li[10]/a") WebElement clicklogin;
	
	@FindBy(id="login-email") WebElement username;
		
	@FindBy(id="login-password") WebElement password;
	
	@FindBy(xpath="//button[text()='Log In']") WebElement loginbutton;
				
	public void clickloginbutton(String user,String pass) throws Exception 
	
	{
		
		username.sendKeys(user);
		Thread.sleep(2000);		
		password.sendKeys(pass);
		Thread.sleep(2000);			
		loginbutton.click();		
	
	}
	
}
