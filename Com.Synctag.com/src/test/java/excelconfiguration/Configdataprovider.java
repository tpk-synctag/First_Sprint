package excelconfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configdataprovider 
{

	Properties pro;
	
	public Configdataprovider()
	{
		
		File src =new File("./Configuration/config.properties");
		
		try {
			
			FileInputStream fis=new FileInputStream(src);
			
			pro=new Properties();
			
			pro.load(fis);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			}
	
	public String getApplicationURL()
	
	{
		String url=pro.getProperty("url");
		return url;
		
	}
	
	public String getchromepath()
	
	{
		
		String url=pro.getProperty("chrome");
		return url;
		
	}
	
	public String getfirefox()

	{
	String url=pro.getProperty("firefox");
	return url;
	
	}

	public String getIEpath()

	{
	String url=pro.getProperty("IEpath");
	return url;
	
	}
	
	public String getOperadriver()

	{
	String url=pro.getProperty("operapath");
	return url;
	
	}
	
}
