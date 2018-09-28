package pages_media;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Media_pages
{

	WebDriver driver;
	
	public Media_pages(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	
	
	@FindBy(xpath="//*[@id='accountSelectionModal']/div/div/div[1]/button") WebElement closepopup;
	
	@FindBy(xpath="//*[@id='toast-container']/div/div[1]/button") WebElement close_toaster;
	
	
	@FindBy(xpath="//div[@id='navBtn']") WebElement option;

	@FindBy(xpath="//*[@id='header']/div[1]/div[2]/div[4]/ul/li[4]")WebElement click_media ;     
	
	@FindBy(xpath="//a[@class='dropdown-toggle navbar-user-name cursor_pointer']") WebElement click_dropdown ;
	
	@FindBy(xpath="//*[@id='header']/div[1]/div[2]/div[3]/ul/li/ul/li[2]") WebElement select_Manageaddaccount ;
	
	@FindBy(xpath="//*[@id='content']/section/div/div[1]/div/div[1]/p/a") WebElement click_addaccount ;
	
	// Youtube Add Accounts
		@FindBy(xpath=".//*[@id='test1']/div[1]/div") WebElement click_youtube ;  
		@FindBy(xpath="//input[@id='identifierId']") WebElement youtube_user ; 
		@FindBy(xpath="//div[@id='identifierNext']") WebElement youtube_user_Next ; 
		@FindBy(xpath="//*[@id='password']/div[1]/div/div[1]/input") WebElement youtube_pass ; 
		@FindBy(xpath="//div[@id='passwordNext']") WebElement youtube_Pass_Next ; 
		@FindBy(xpath="//div[@id='submit_approve_access']") WebElement youtube_permission_allow ; 
		 
	
	// DailyMotion Add Accounts
	@FindBy(xpath="//*[@id='test1']/div[2]/div") WebElement click_dailymotion ;  
	@FindBy(xpath="//*[@id='login_email']") WebElement daily_user ; 
	@FindBy(xpath="//*[@id='dm_loginform']/p[2]/input") WebElement daily_pass ; 
	@FindBy(xpath="/.//input[@id='login_submit']") WebElement dail_login ; 
	
	
	// vimeo Add accounts	
	  // Vimeo Add accounts
	@FindBy(xpath="//*[@id='test1']/div[3]/div/a") WebElement click_vimeo ;
	@FindBy(xpath="//input[@id='signup_email']") WebElement vimeo_user ;
	@FindBy(xpath="/.//input[@id='login_password']") WebElement vimeo_pass ;
	@FindBy(xpath="//*[@id='login_form']/div[5]/input") WebElement vimeo_login ;
	@FindBy(xpath="//*[@id='main']/article/div/div/div/form/input[9]") WebElement vimeo_allow ;
	
	// SoundCloud 	
	@FindBy(xpath="//*[@id='test1']/div[4]/div/a") WebElement click_soundcloud ; 
	@FindBy(xpath="/.//input[@id='username']") WebElement sound_user ; 
	@FindBy(xpath="/.//input[@id='password']") WebElement sound_pass ; 
	@FindBy(xpath="//*[@id='authorize']") WebElement sound_login ; 
	@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]/div[5]") WebElement sound_click_captcha ;
	
	// click to Home 
	@FindBy(xpath="//*[@id='main-menu']/li[2]/a") WebElement click_Home_Media ;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[5]/a") WebElement click_dailymotion_logo ;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[5]/ul/li[2]/a") WebElement click_dailymotion_dorpdown ;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/a") WebElement click_vimeo_logo ;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/ul/li[2]/a") WebElement click_vimeo_dropdown;
	@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[2]/a") WebElement click_tube ;
	@FindBy(xpath="//*[@id='main-menu']/li[3]/a") WebElement click_favourite;
	
  
	
	public void moving_medial_module() throws Exception  
	
	{
		Thread.sleep(5000);
		option.click();
		Thread.sleep(5000);
		click_media.click();
		Thread.sleep(8000);
		click_dropdown.click();
		Thread.sleep(5000);
		select_Manageaddaccount.click();
		Thread.sleep(6000);
		
		
		
	}
	
	public void add_media_youtube_acount(String youuser,String youpass) throws Exception
	{
		click_addaccount.click();
		Thread.sleep(6000);
		click_youtube.click();
		Thread.sleep(3000);
		youtube_user.sendKeys(youuser);
		Thread.sleep(3000);
		youtube_user_Next.click();
		Thread.sleep(2000);
		youtube_pass.sendKeys(youpass);
		Thread.sleep(3000);
		youtube_Pass_Next.click();
		Thread.sleep(15000);
		youtube_permission_allow.click();
		Thread.sleep(6000);
		
	}
	
	
	public void add_media_Dailymotion_acount(String daiuser,String daipass) throws Exception
	{
		click_addaccount.click();
		Thread.sleep(2000);
		click_dailymotion.click();
		Thread.sleep(2000);
		daily_user.sendKeys(daiuser);
		Thread.sleep(2000);
		daily_pass.sendKeys(daipass);
		Thread.sleep(2000);
		dail_login.click();
		Thread.sleep(2000);
						
	}
	
	public void add_media_Vimeo_acount(String vimuser,String vimspass) throws Exception
	{
	 		
		click_addaccount.click();
		Thread.sleep(2000);
		click_vimeo.click();
		Thread.sleep(2000);
		vimeo_user.sendKeys(vimuser);
		Thread.sleep(2000);
		vimeo_pass.sendKeys(vimspass);
		Thread.sleep(2000);
		vimeo_login.click();
		Thread.sleep(2000);
		vimeo_allow.click();
	}
	
	public void add_media_souncloud_acount(String sounduser,String soundpass) throws Exception
	{
		click_addaccount.click();
		Thread.sleep(4000);
		click_soundcloud.click();
		Thread.sleep(4000);
		sound_user.sendKeys(sounduser);
		Thread.sleep(4000);
		sound_pass.sendKeys(soundpass);
		Thread.sleep(4000);
		sound_click_captcha.click();
		Thread.sleep(20000);
	 	sound_login.click();
	}
	

	
	
	 
	
		
	
}
