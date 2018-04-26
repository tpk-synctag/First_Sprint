package page_mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePages 
{

	WebDriver driver;
	public HomePages(WebDriver ldriver)
	
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="//div[@class='container']/div[2]/ul/li[1]/a") WebElement clickHome;
	
	@FindBy(xpath="//div[@class='container']/div[2]/ul/li[2]/a") WebElement clickSolutions;
	
	@FindBy(xpath="//div[@class='container']/div[2]/ul/li[3]/a") WebElement clickFeatures;
	
	@FindBy(xpath="//div[@class='container']/div[2]/ul/li[4]/a") WebElement clickClients;
	
	@FindBy(xpath="//div[@class='container']/div[2]/ul/li[5]/a") WebElement clickBlogs;
	
	@FindBy(xpath="//div[@class='container']/div[2]/ul/li[6]/a") WebElement clickContact;
			
	@FindBy(xpath="//div[@class='collapse navbar-collapse']/ul/li[10]") WebElement clicklogin;
	
	@FindBy(xpath="//div[@class='container']/div[2]/ul/li[12]") WebElement clickRigister;
	
					
	public  void homepages_loginbutton()
	{
		clicklogin.click();
				
	}
	public  void homepages1()
	{
		clickHome.click();
		
	}
	public  void homepagesRegs()
	{
		clickRigister.click();
		
	}
	
}
