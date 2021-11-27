package com.crm.vtiger.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	public String GetPropertyKeyValue(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(AutoConstant.propertypath);
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}

}
