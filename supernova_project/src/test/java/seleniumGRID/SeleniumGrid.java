package seleniumGRID;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid
{
	@Parameters("browser")
	@Test
	public void gridpractice(String browser) throws MalformedURLException
	{
		RemoteWebDriver rdriver;
		if(browser.equalsIgnoreCase("chrome"))
		{
		URL url=new URL("http://3.143.242.46:4444/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		 rdriver=new RemoteWebDriver(url, capabilities);
		 rdriver.manage().window().maximize();
		 rdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rdriver.get("https://www.amazon.in/");
		}
	
		else if(browser.equalsIgnoreCase("firefox"))
		{
			URL url=new URL("http://3.143.242.46:4444/wd/hub");
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
			rdriver=new RemoteWebDriver(url, capabilities);
			rdriver.manage().window().maximize();
			rdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			rdriver.get("https://www.flipkart.com/");
		}

}
}
