package supernova_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.ReporterConfig.Property;
import org.testng.annotations.Test;


public class ReadingdatafrompropertyfileTest 
{
	@Test
	public void readpropretyfile() throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/sample.property");
		Properties prop=new Properties();
		prop.load(fis);
		String username1=prop.getProperty("username");
		String password1=prop.getProperty("password");
		System.out.println(username1);
		System.out.println(password1);
		
		
	}

}
