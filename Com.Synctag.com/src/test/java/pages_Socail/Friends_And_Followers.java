package pages_Socail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Friends_And_Followers 
{

	
	
	WebDriver driver;
	
	
	
	public Friends_And_Followers(WebDriver locdriver)
	{
		this.driver=locdriver;
		
	}
	
	@FindBy(xpath="//*[@id='main-menu']/li[2]/a") WebElement click_Friends_Followers;  // click friends AND Followers
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/a") WebElement click_FF_fb;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/ul[1]/li[2]/a") WebElement click_FF_profile_Fb; // FF fb profile account seletion 
	
	@FindBy(xpath="//*[@id='content']/section/div[1]/div[2]/div[4]/div[1]/a/div") WebElement click_FB_FF_profile;  // F F Synctag fb profile 
		
	@FindBy(xpath="//*[@id='InstaBioDesc']/div/div[2]/div[7]/div[3]") WebElement click_FB_View;  // FB sync page view 
					
	
	
	
	// Twitter friends and followers
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[5]/a") WebElement click_twitter_account;  // Twitter account for Friends & followers
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[5]/ul[1]/li[3]/a") WebElement click_twitter_profile;  // Twitter account for Friends & followers
	
	@FindBy(xpath="//*[@id='content']/section/div[1]/div[2]/div[2]/div[1]/div/div/button[2]") WebElement click_twitter_following;
	
	@FindBy(xpath="//*[@id='content']/section/div[1]/div[2]/div[4]/div[11]/a/div") WebElement click_twitter_following_profile;
	
	@FindBy(xpath="//*[@id='InstaBioDesc']/div/div[2]/div[7]/div[3]") WebElement click_twitter_following_view;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]") WebElement click_twitter_syncpage_casecade;
	
		
	// Filter by Friends and followers
	@FindBy(xpath="//ul[@class='projectHeader-nav no-margin']/li[4]") WebElement click_twitter_syncpage_filter;    //*[@id='content']/div/div/div/ul/li[4]
	
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/ul/li[1]") WebElement click_twitter_syncpage_filter_image; 
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/ul/li[2]") WebElement click_twitter_syncpage_filter_videos;  
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/ul/li[3]") WebElement click_twitter_syncpage_filter_text;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/ul/li[4]") WebElement click_twitter_syncpage_filter_link;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/ul/li[5]") WebElement click_twitter_syncpage_filter_all;
	
	
	
	public void twitter_syncpage_filter() throws Exception
	{
		
		click_twitter_syncpage_filter.click();
		Thread.sleep(5000);
		click_twitter_syncpage_filter_image.click();
		Thread.sleep(5000);
		click_twitter_syncpage_filter.click();
		Thread.sleep(5000);
		click_twitter_syncpage_filter_videos.click();
		Thread.sleep(5000);
		click_twitter_syncpage_filter.click();
		Thread.sleep(5000);
		click_twitter_syncpage_filter_text.click();
		Thread.sleep(5000);
		click_twitter_syncpage_filter.click();
		Thread.sleep(5000);
		click_twitter_syncpage_filter_link.click();
		Thread.sleep(5000);
		click_twitter_syncpage_filter.click();
		Thread.sleep(5000);
		click_twitter_syncpage_filter_all.click();
		
		
	}
	
	
	public void click_friends_Followers() throws Exception
	{
		
		click_Friends_Followers.click();
		Thread.sleep(9000);
						
	}
	

	
	public void frineds_and_Followers_facebook() throws Exception
	{
		click_FF_fb.click();
		Thread.sleep(5000);
		click_FF_profile_Fb.click();
		Thread.sleep(5000);
		click_FB_FF_profile.click();
		Thread.sleep(5000);
		click_FB_View.click();
		Thread.sleep(8000);
		
		
	}
	
	
	public void friends_and_followers_twitter() throws Exception
	{
		click_twitter_account.click();
		Thread.sleep(5000);
		click_twitter_profile.click();
		Thread.sleep(5000);
		click_twitter_following.click();
		Thread.sleep(5000);
		click_twitter_following_profile.click();	
		Thread.sleep(5000);
		click_twitter_following_view.click();
		Thread.sleep(5000);
		click_twitter_syncpage_casecade.click();
		Thread.sleep(5000);
				
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
