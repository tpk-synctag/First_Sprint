package page_mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_All_Mail_Account_Page
{

	WebDriver driver;
	
	public Add_All_Mail_Account_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	
	
	@FindBy(xpath="//*[@id='accountSelectionModal']/div/div/div[1]/button") WebElement closepopup;
	
	@FindBy(xpath="//*[@id='navBtn']/a/img") WebElement option;
	
	@FindBy(xpath="//*[@id='toast-container']/div/div[1]/button") WebElement close_iteration_toaster;

	@FindBy(xpath="//ul[@class='navList']/li[1]")WebElement clickmail ;     
	
	@FindBy(xpath="//*[@id='test1']/div[1]/a") WebElement clickgoogle ; // Gmail Account 
	@FindBy(xpath="//*[@id='test1']/div[2]/a") WebElement clickmicrosoftoutlook ; //Outlook mail
	
	//Outlook Adding
	@FindBy(xpath="//input[@id='i0116']") WebElement msusername;   // outlook username
	@FindBy(xpath="//input[@id='idSIButton9']") WebElement msnext ; 
	@FindBy(xpath="//input[@id='i0118']") WebElement mspass ;        //outlook pass
	@FindBy(xpath="//input[@id='idSIButton9']") WebElement mssignin ;
	
	//Gmail account adding
	@FindBy(xpath="//input[@id='identifierId']") WebElement username;
	@FindBy(xpath="//div[@id='identifierNext']") WebElement click_gmuser_next;
	@FindBy(xpath="//*[@id='password']/div[1]/div/div[1]/input") WebElement password;
	@FindBy(xpath="//div[@id='passwordNext']") WebElement click_gmpass_Next;
	@FindBy(xpath="//div[@id='submit_approve_access']") WebElement Click_allow;
	
	
	
	//others account adding
	
	@FindBy(xpath="//div[@class='col-lg-4 col-sm-6 col-xs-12 nopadding']/p/a")WebElement click_Addaccount;
	@FindBy(xpath="//*[@id='test1']/div[3]/a")WebElement click_Others;
	@FindBy(xpath="//input[@id='EmailId']")WebElement email_id;
	@FindBy(xpath="//input[@id='Password']")WebElement email_password;
	@FindBy(xpath="//*[@id='emailForm']/button[1]")WebElement Click_add;
	
	// Move to individual Inboxs
	@FindBy(xpath="//*[@id='main-menu']/li[2]/a")WebElement clickinbox;
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/ul/li[4]/a")WebElement click_OutlookInbox;     // click outlook provider 
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/ul/li[4]/ul/li[2]/a") WebElement click_enable_mail;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/ul/li[5]/a") WebElement click_yahooProvider;     // Click Yahoo provider		
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/ul/li[5]/ul/li[2]/a") WebElement click_yahoo_mail; // .//*[@id='content']/div[1]/div/div/ul/li[5]/ul/li[2]/a
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/ul/li[6]/a") WebElement click_others; // click zoho provider
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/ul/li[6]/ul/li[2]/a") WebElement click_others_mail;
	
	
	
	By listofmail=By.xpath("//*[@id='email-list']/ul/li");
	
	
	
	public void Add_Gmail_accounts(String gmuser,String gmpass) throws Exception  // Gmail Account adding

	{
		
	//closepopup.click();
	//Thread.sleep(2000);
	//option.click();
	//Thread.sleep(5000);
	//clickmail.click();
	
	click_Addaccount.click();
	Thread.sleep(5000);
	
	clickgoogle.click();
	Thread.sleep(5000);
	
	username.sendKeys(gmuser);
	Thread.sleep(5000);
	click_gmuser_next.click();
	Thread.sleep(5000);
	password.sendKeys(gmpass);
	Thread.sleep(5000);
	click_gmpass_Next.click();
	Thread.sleep(8000);
	Click_allow.click();			
	
	}
	
	public void add_Outlook_Account(String msuse,String mspas) throws Exception  //Outlook account adding
	
	{
		closepopup.click();
		Thread.sleep(2000);
		
		close_iteration_toaster.click();
		Thread.sleep(5000);
		
		option.click();
		Thread.sleep(5000);
		
		clickmail.click();
		Thread.sleep(5000);		
		
		clickmicrosoftoutlook.click();
		Thread.sleep(5000);	
		
		msusername.sendKeys(msuse);
		Thread.sleep(5000);
		msnext.click();
		Thread.sleep(5000);
		mspass.sendKeys(mspas);
		Thread.sleep(5000);
		mssignin.click();
		
		
	}
	
	public void add_Others_Account(String otusername,String otpass) throws Exception // Yahoo account adding 
	{
		
		click_Addaccount.click();
		Thread.sleep(5000);
		click_Others.click();
		Thread.sleep(5000);
		email_id.sendKeys(otusername);
		Thread.sleep(5000);
		email_password.sendKeys(otpass);
		Thread.sleep(5000);
		Click_add.click();
		Thread.sleep(6000);
			
		//clickinbox.click();
		//Thread.sleep(6000);
		
		
	}
	
	public void click_Inbox () throws Exception
	{
		
		clickinbox.click();
		Thread.sleep(6000);
		click_OutlookInbox.click();
		Thread.sleep(6000);
		click_enable_mail.click();
		Thread.sleep(6000);
		
		//WebDriverWait wait=new WebDriverWait(driver, 50);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='email-list']/ul/li")));
		
		click_yahooProvider.click();
		Thread.sleep(6000);
		click_yahoo_mail.click();
		Thread.sleep(6000);
		
		click_others.click();
		Thread.sleep(6000);
		click_others_mail.click();
		Thread.sleep(6000);
		
		
	}
	

	
	public String getpagetitle()
	{
		return driver.getTitle();
				
	}
	
	
	
	
}
