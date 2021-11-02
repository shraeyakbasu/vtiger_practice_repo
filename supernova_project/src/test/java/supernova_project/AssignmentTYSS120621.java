package supernova_project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTYSS120621 
{
	
	@Test
	public void assignmenttyss120621()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		//options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com");
		
		
		driver.findElement(By.xpath("//input[@id='city']")).click();
		List<WebElement> cities=driver.findElements(By.xpath("//a[@class='lng_autosg tcon']"));
		for(int i=0;i<cities.size();i++)
		{
			if(cities.get(i).getText().equalsIgnoreCase("mumbai"))
			{
				cities.get(i).click();
				break;
			}
		}
		
        List<WebElement> lists=driver.findElements(By.xpath("//span[@class='hotkeys-text']"));
		
		for(int i=0;i<lists.size();i++)
		{
			if(lists.get(i).getText().equalsIgnoreCase("Restaurants"))
			{
				lists.get(i).click();
				break;
			}
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'View All Categories')]")));
		
		WebElement element1=driver.findElement(By.xpath("//a[contains(text(),'View All Categories')]"));
		js.executeScript("arguments[0].click()", element1);
		
		List<WebElement> restauranrtypes=driver.findElements(By.xpath("//span[@class='meditle lng_commn']"));
		
		for(int i=0;i<restauranrtypes.size();i++)
		{
			if(restauranrtypes.get(i).getText().equalsIgnoreCase("Modern Indian Restaurants"))
			{
				restauranrtypes.get(i).click();
				break;
			}
		}
		
		List<WebElement> hoteldetails=driver.findElements(By.xpath("//li[@class='cntanr']"));
	    for(int i=0;i<4;i++)
	    {
	    	System.out.println(hoteldetails.get(i).getText());
	    }
	    
	    driver.findElement(By.xpath("//span[.='Sahil Hotel']")).click();
	    
	    WebElement crusinedetails=driver.findElement(By.xpath("//span[@class='quickinfosub wrapper']"));
	    System.out.println(crusinedetails.getText());
	    
	    List<WebElement> services=driver.findElements(By.xpath("//p[contains(text(),'Services & Amenities')]/following-sibling::li"));
		for(int i=0;i<services.size();i++)
		{
			System.out.println(services.get(i).getText());
		}
		
		driver.quit();
		
	}

}
