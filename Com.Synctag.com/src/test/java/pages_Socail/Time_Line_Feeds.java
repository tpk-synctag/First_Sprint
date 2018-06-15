package pages_Socail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_Line_Feeds 
{

	WebDriver driver;
	
	public Time_Line_Feeds(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	
	@FindBy(xpath="//*[@id='main-menu']/li[3]/a")WebElement click_timeline;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[9]")WebElement click_tmsync_casecade;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[7]")WebElement click_tm_filter;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[7]/ul/li[1]")WebElement click_tm_Images;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[7]/ul/li[2]")WebElement click_tm_video;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[7]/ul/li[3]")WebElement click_tm_text;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[7]/ul/li[4]")WebElement click_tm_link;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[7]/ul/li[5]")WebElement click_tm_all;
	
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/a") WebElement click_fb;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/ul/li[2]/a") WebElement click_fb_profile; //*[@id='content']/div/div/div/ul/li[4]/ul[1]/li[2]
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[5]/a") WebElement click_twiter;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[5]/ul/li[2]/a") WebElement click_twi_profile;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/a") WebElement click_inst;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/ul/li[2]/a") WebElement click_inst_profile;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[2]/a") WebElement click_sync_logo;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[8]") WebElement click_casecade_style;
	
	

	public void timeline_instagram() throws Exception
	{
		click_inst.click();
		Thread.sleep(5000);
		click_inst_profile.click();
		Thread.sleep(5000);
	}
	
	public void timeline_twitter() throws Exception
	{
		click_twiter.click();
		Thread.sleep(5000);
		click_twi_profile.click();
		Thread.sleep(5000);
		
	}
	
	public void timeline_facebook() throws Exception
	{
		click_fb.click();
		Thread.sleep(5000);
		click_fb_profile.click();
		Thread.sleep(5000);
		click_tmsync_casecade.click();
		Thread.sleep(5000);
	}
		
	
	public void filter_time_line() throws Exception
	{
		
		click_timeline.click();
		Thread.sleep(5000);
		click_tmsync_casecade.click();
		Thread.sleep(5000);
		click_tm_filter.click();
		Thread.sleep(5000);
		click_tm_Images.click();
		Thread.sleep(5000);
		click_tm_filter.click();
		Thread.sleep(5000);
		click_tm_video.click();
		Thread.sleep(5000);
		click_tm_filter.click();
		Thread.sleep(5000);
		click_tm_text.click();
		Thread.sleep(5000);
		click_tm_filter.click();
		Thread.sleep(5000);
		click_tm_link.click();
		Thread.sleep(5000);
		click_tm_filter.click();
		Thread.sleep(5000);
		click_tm_all.click();
		
		
	}
	
	
	public void filter_instgram_time_line() throws Exception
	{
		
		click_timeline.click();
		Thread.sleep(5000);
		click_tmsync_casecade.click();
		Thread.sleep(5000);
		click_tm_filter.click();
		Thread.sleep(5000);
		click_tm_Images.click();
		Thread.sleep(5000);
		click_tm_filter.click();
		Thread.sleep(5000);
		click_tm_video.click();
		Thread.sleep(5000);
		click_tm_filter.click();
		Thread.sleep(5000);
		click_tm_all.click();
		
		
	}
	
	
	
}
