package pages_Socail;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Social_AddAcount 
{

	
	WebDriver driver;
	
	
	public Social_AddAcount(WebDriver lodriver)
	{
		this.driver=lodriver;
				
	}
	
	
	@FindBy(css=".close.modal-close") WebElement closepopup;   // close Pop-up  //*[@id='accountSelectionModal']/div/div/div[1]/button
	@FindBy(id="navBtn") WebElement option;  	
	@FindBy(xpath="//ul[@class='navList']/li[2]") WebElement click_social;  		//click social
										
	
	//facebook
	
	@FindBy(xpath="//*[@id='test1']/div[1]/a") WebElement click_facebook; 
	@FindBy(id="email") WebElement fb_username;
	@FindBy(id="pass") WebElement fb_pass;
	@FindBy(xpath="//*[@id='loginbutton']") WebElement fb_clicklogin;
	
	//Twitter
	
	@FindBy(xpath="//*[@id='content']/section/div/div/div/div[1]/p/a[1]") WebElement add_account;
	@FindBy(xpath="//*[@id='test1']/div[2]/a") WebElement click_twitter;	
	@FindBy(id="username_or_email") WebElement tw_username;
	@FindBy(id="password") WebElement tw_pass;
	@FindBy(xpath="//*[@id='allow']") WebElement tw_clicklogin;
	
	//Instagram
	
	@FindBy(xpath="//*[@id='content']/section/div/div/div/div[1]/p/a[1]") WebElement add_accountin;
	@FindBy(xpath="//*[@id='test1']/div[3]/a") WebElement ins_click_instgram;
	@FindBy(xpath="//*[@id='id_username']") WebElement ins_clickuser;
	@FindBy(xpath="//*[@id='id_password']") WebElement ins_clickpass;
	@FindBy(xpath="//*[@id='login-form']/p[3]/input") WebElement ins_clicklogin;
	
	//Linkedin
	
	@FindBy(xpath="//*[@id='content']/section/div/div/div/div[1]/p/a[1]") WebElement add_accountLin;     //  
	@FindBy(xpath="//*[@id='test1']/div[4]/a") WebElement link_click_linked;
	@FindBy(xpath="//*[@id='session_key-oauth2SAuthorizeForm']") WebElement link_clickuser;
	@FindBy(xpath="//*[@id='session_password-oauth2SAuthorizeForm']") WebElement link_clickpass;
	@FindBy(xpath="//*[@id='body']/div/form/div[2]/ul/li[1]/input") WebElement link_clicklogin;
	
	
	
	//Click Home
	
			@FindBy(xpath="//*[@id='main-menu']/li[1]/a/span") WebElement click_home;
			@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/a") WebElement click_fb;
			@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[4]/ul/li[2]/a") WebElement click_fb_profile;
			
			@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[5]/a") WebElement click_twiter;
			@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[5]/ul/li[2]/a") WebElement click_twi_profile;
			
			@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/a") WebElement click_inst;
			@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[6]/ul/li[2]/a") WebElement click_inst_profile;
			
			@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[2]/a") WebElement click_sync_logo;
			
			@FindBy(xpath="//*[@id='content']/div/div/div/ul/li[8]") WebElement click_casecade_style;
													
	
	
	public void seleScial() throws InterruptedException 
	{
		
			//closepopup.click();
			Thread.sleep(5000);
			option.click();
			Thread.sleep(5000);
			click_social.click();
		
	}
		
	
	public void facebooklogin(String use,String pas) throws InterruptedException 
	{
				
		Thread.sleep(5000);
		click_facebook.click();
		fb_username.sendKeys(use);
		Thread.sleep(3000);
		fb_pass.sendKeys(pas);
		Thread.sleep(3000);
		fb_clicklogin.click();
		
	}
	
	
	public void twitterlogin(String twuse,String twpas) throws Exception
	{
		add_account.click();
		Thread.sleep(3000);
		click_twitter.click();
		Thread.sleep(3000);
		tw_username.sendKeys(twuse);
		Thread.sleep(3000);
		tw_pass.sendKeys(twpas);
		Thread.sleep(3000);
		tw_clicklogin.click();		
		
	}
	
	
	public void instagram(String inuse,String inpass) throws Exception
	{
		
		add_accountin.click();
		Thread.sleep(3000);
		ins_click_instgram.click();
		Thread.sleep(3000);
		ins_clickuser.sendKeys(inuse);
		Thread.sleep(3000);
		WebElement ele=ins_clickpass;
		ele.sendKeys(inpass);
		Thread.sleep(3000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//ins_click_instgram.click();
		
		
	}
	
	
	
	
	public void linkedin(String linkuse,String linkpass) throws Exception
	{
		
		add_accountLin.click();
		Thread.sleep(3000);
		link_click_linked.click();
		Thread.sleep(3000);
		link_clickuser.sendKeys(linkuse);
		Thread.sleep(3000);
		link_clickpass.sendKeys(linkpass);
		Thread.sleep(3000);
		link_clicklogin.click();	
		
	}
	
	
	public void click_home() throws Exception 
	{
		click_home.click();
		Thread.sleep(5000);
		click_fb.click();
		Thread.sleep(5000);
		click_fb_profile.click();
		Thread.sleep(5000);
		
		click_twiter.click();
		Thread.sleep(5000);
		click_twi_profile.click();
		Thread.sleep(5000);
		
		//click_inst.click();
		//Thread.sleep(5000);
		//click_inst_profile.click();
		//Thread.sleep(5000);
		
		click_sync_logo.click();
		Thread.sleep(5000);		
		click_casecade_style.click();					
		Thread.sleep(5000);
		
			
	}
	
	
}
