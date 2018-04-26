package factory;

import excelconfiguration.Configdataprovider;
import excelconfiguration.Exceldataconfiguration;
import excelconfiguration.InputDataConfiguration;

public class DataProviderFactory 
{

	
	
	public static Configdataprovider getconfig()
	{	
		Configdataprovider config=new Configdataprovider();
		return config;
		
		
	}
	
	public static Exceldataconfiguration getexcel()
	{	
		Exceldataconfiguration excel=new Exceldataconfiguration();
		return excel;
		
	}
	
	public static InputDataConfiguration getinput()
	{
		InputDataConfiguration input=new InputDataConfiguration();
		return input;
		
	}
}
