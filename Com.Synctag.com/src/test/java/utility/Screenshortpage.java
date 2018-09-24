package utility;

import java.io.File;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;





public class Screenshortpage 
{

	 
	
	public static void capturescreenshot(WebDriver driver)
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\user\\Desktop\\Automation_Testing_Framework\\Com.Synctag.com\\Screenshot\\login.png");
		
		try 
		{
			FileUtils.copyFile(src, dest);
		} 
		catch (Exception e) 
		{
			System.out.println("The Screenshot messgae is "+e.getMessage());
		}
		
		
		
	}
	
}
