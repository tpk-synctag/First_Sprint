package pages_Socail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Social_Filter 
{

	WebDriver driver;
	
	public Social_Filter(WebDriver ldriver)
	{
		
		this.driver=ldriver;
	}
	
	// Filter options
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]") WebElement click_filter; 
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/ul/li[1]/i") WebElement click_filter_image; 
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/ul/li[2]/i") WebElement click_filter_videos;  
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/ul/li[3]/i") WebElement click_filter_text;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/ul/li[4]/i") WebElement click_filter_link;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/ul/li[5]/i") WebElement click_filter_all;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[7]/i") WebElement click_liststyle;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[8]") WebElement click_casecade;
	@FindBy(xpath="//*[@id='main-menu']/li[1]/a") WebElement click_home;
	
	
	public void timeline_to_home() throws Exception
	{
		click_home.click();
		Thread.sleep(9000);
		click_casecade.click();
		Thread.sleep(5000);
		
	}
	
	
	public void click_filters() throws Exception
	{
		
		click_filter.click();
		Thread.sleep(5000);
		click_filter_image.click();
		Thread.sleep(9000);
		
		click_filter.click();
		Thread.sleep(5000);
		click_filter_videos.click();
		Thread.sleep(9000);

		click_filter.click();
		Thread.sleep(5000);
		click_filter_text.click();
		Thread.sleep(9000);
	
		click_filter.click();
		Thread.sleep(5000);
		click_filter_link.click();
		Thread.sleep(9000);
	
		click_filter.click();
		Thread.sleep(5000);
		click_filter_all.click();
		Thread.sleep(9000);
		click_liststyle.click();
		Thread.sleep(9000);
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1050)");*/
		
		
		
	}
	
	
	
	
}
