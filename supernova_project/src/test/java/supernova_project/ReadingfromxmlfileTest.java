package supernova_project;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;


public class ReadingfromxmlfileTest
{
    @Test
	public void readfromxml(XmlTest test)
	{
		String username=test.getParameter("username");
		String browser=test.getParameter("browser");
		String password=test.getParameter("password");
		
		System.out.println(username);
		System.out.println(browser);
		System.out.println(password);
		
		
	}
}
