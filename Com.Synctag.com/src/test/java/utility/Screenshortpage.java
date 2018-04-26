package utility;

import java.io.File;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;





public class Screenshortpage 
{

	static WebDriver driver ;
	
	public static void main(String Screensht)
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./Screenshot/screen1");
		
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
