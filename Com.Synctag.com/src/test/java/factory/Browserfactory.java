package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browserfactory
{

	static WebDriver driver;
	
	
	public static WebDriver getbrowser(String Browsername)
	{
		if(Browsername.equalsIgnoreCase("firefox"))
		{						
			System.setProperty("webdriver.gecko.driver",DataProviderFactory.getconfig().getfirefox()); 
			
						
			driver=new FirefoxDriver();
			
		}
		else if(Browsername.equalsIgnoreCase("chrome"))
		{
						
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getconfig().getchromepath());
			
			driver=new ChromeDriver();
			
		}
		else if(Browsername.equalsIgnoreCase("IEpath"))
		{				
			
			System.setProperty("webdriver.ie.driver", DataProviderFactory.getconfig().getIEpath());
			
			driver=new InternetExplorerDriver();
			
			
			
		}
		else if(Browsername.equalsIgnoreCase("operapath"))
		{
					
			String operaChromiumDriver = DataProviderFactory.getconfig().getOperadriver();
			String operaBrowserLocation = "C:\\Program Files\\Opera\\55.0.2994.44\\opera.exe";
 
			System.setProperty("webdriver.opera.driver", operaChromiumDriver);
			ChromeOptions options = new ChromeOptions();
			options.setBinary(operaBrowserLocation);        

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options); // capabilities , 
			//OperaDriver browser = new OperaDriver(options);   
						
		//	driver=browser;
			
		}
		
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void closebrowser(WebDriver ldriver)
	{
		
		ldriver.quit();
		
	}
	

}
