package supernova_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarpopupTest 
{
	@Test
	public void calendarpopup() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		//launching the browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//opening the url 
		driver.get("https://www.cleartrip.com/");
		//scrolling vertically
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("FromTag")).sendKeys("BLR");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	
		driver.findElement(By.id("ToTag")).sendKeys("BOM");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		//retrieving current date
		Date datedata=new Date();
		String currentdate=datedata.toString();
		System.out.println(currentdate);
		//spliting and converting the date into desired format 
		String arr[]=currentdate.split(" ");
		String day=arr[0];
		String month=arr[1];
		String date=arr[2];
		String year=arr[5];
		String formateddate=(day+" "+month+" "+date+" "+year);
		System.out.println(formateddate);
		//clicking on today's date
		driver.findElement(By.xpath("(//a[contains(text(),"+date+")])[1]")).click();
		
		int count=0;
		while(count<23)
		{
			//checking if date is present or not
			try
			{
				driver.findElement(By.xpath("//td[@data-month='8'][@data-year='2021']/a[text()='4']")).click();
				break;
			}
			//if date not present click on next button
			catch(Exception e)
			{
				WebElement nextbutton=driver.findElement(By.xpath("(//a[@title='Next'])[2]"));
				js.executeScript("arguments[0].click()", nextbutton);
				
				count++;
			}
		}
		
		//closing the browser
		driver.quit();
		
		
		
		
		
	}
	

}
