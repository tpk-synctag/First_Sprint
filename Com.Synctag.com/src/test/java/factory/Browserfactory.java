package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

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
			
			System.setProperty("webdriver.opera.driver", DataProviderFactory.getconfig().getOperadriver());
			
			driver=new OperaDriver();
			
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
