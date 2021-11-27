package supernova_project;

import org.testng.annotations.Test;

public class ReadingfromcommandTest 
{
	@Test
	public void readfromcommand()
	{
		String username=System.getProperty("username");
		String browser=System.getProperty("browser");
		String password=System.getProperty("password");
		System.out.println(username);
		System.out.println(browser);
		System.out.println(password);
		
		
	}

}
