package excelconfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class InputDataConfiguration 
{

	WebDriver driver;
	
	Properties prop;
	
	public InputDataConfiguration()
	{
	
		File src=new File("./Configuration/InputConfig.properties");
		
		try {
			
			FileInputStream fis=new FileInputStream(src);
			
			prop=new Properties();
			
			prop.load(fis);
			
		} 
		catch (Exception e) 
		{
			
			System.out.println("The Exception is :"+e.getMessage());
		} 
				
	}
	
	
	public String email_usename()
	{
		
		String email=prop.getProperty("email_id");
		return email;
		
	}
	
	public String email_password()
	{
		
		String email=prop.getProperty("email_pass");
		return email;
		
	}
	public String zoho_email_id()
	{
		
		String email=prop.getProperty("zoho_email");
		return email;
		
	}
	
	public String zoho_password()
	{
		
		String email=prop.getProperty("zoho_password");
		return email;
		
	}
	public String gmail_user()
	{
		
		String email=prop.getProperty("gmail_username");
		return email;
		
	}
	
	public String gmail_pass()
	{
		
		String email=prop.getProperty("gmail_password");
		return email;
		
	}
	
	
}
