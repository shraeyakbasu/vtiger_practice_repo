package supernova_project;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.crm.vtiger.utility.ExcelUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTYSS100621
{
	@Test
	public void assignmenttyss() throws InterruptedException, IOException
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in");
		
		driver.findElement(By.xpath("//input[@id='suggestionBoxEle']")).sendKeys("samsung mobile");
		driver.findElement(By.xpath("//button[@id='RIL_HomeSearchButton']")).click();
		Thread.sleep(3000);
		//List<WebElement> element=driver.findElements(By.xpath("//div[@class='pl__container']/descendant::a"));
		List<WebElement> element=driver.findElements(By.xpath("//p[@class='sp__name']"));
		for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());
		}
		
		for(int i=0;i<element.size();i++)
		{
			
			String [] data=element.get(i).getText().split(",");
			for(int j=0;j<data.length;j++)
			{
				System.out.print(data[j]);	
				System.out.print('\n');
			}
			
			ExcelUtility.setexcelvalue("samsung", data);
		
		
		}
		
	
	}

}
