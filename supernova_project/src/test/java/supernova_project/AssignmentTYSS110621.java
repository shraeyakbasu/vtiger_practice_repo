package supernova_project;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTYSS110621 
{

	@Test
	public void assignmentTYSS110621() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in");
		Actions act=new Actions(driver);
		WebElement targettvaudio=driver.findElement(By.xpath("//div[contains(text(),'TELEVISION & AUDIO')]"));
		WebElement destinationhometheatre=driver.findElement(By.xpath("//a[contains(text(),'Home Theatre Systems')]"));
		
		
		act.moveToElement(targettvaudio).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Home Theatre Systems')]")));
		String expectedtitle=destinationhometheatre.getText();
		
		act.moveToElement(destinationhometheatre).click().perform();
		
		WebElement element=driver.findElement(By.xpath("//h1[.='Home Theatre Systems']"));
		String actualtitle=element.getText();
		
		Assert.assertNotEquals(actualtitle, expectedtitle);
		
		WebElement expectedhometheatre=driver.findElement(By.xpath("//p[contains(text(),'Sony HT-IV300 5.1 channel Home Theater System')]"));
		String expectedhometheatrename=expectedhometheatre.getText();
		expectedhometheatre.click();
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al.get(1));
		WebElement actualhometheatre=driver.findElement(By.xpath("//div[.='Sony HT-IV300 5.1 channel Home Theater System']"));
		
		String actualhometheatrename=actualhometheatre.getText();
		
		Assert.assertEquals(actualhometheatrename, expectedhometheatrename);
		
		driver.findElement(By.xpath("//input[@id='RIL_PDPInputPincode']")).sendKeys("700040");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Standard Delivery:')]")));
		WebElement expectedmsg=driver.findElement(By.xpath("//div[contains(text(),'Standard Delivery:')]"));
		String expmsgtext=expectedmsg.getText();
		String actualmsg="Standard Delivery";
		if(expmsgtext.contains(actualmsg)) 
		{
			driver.findElement(By.xpath("//span[.='ADD TO CART']")).click();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[contains(text(),'Sony HT-IV300 5.1 channel Home Theater System')])[2]")));
			
		}
		else
		{
			System.out.println("pin not valid ");
			
		}
		
		WebElement carthometheatre=driver.findElement(By.xpath("(//div[contains(text(),'Sony HT-IV300 5.1 channel Home Theater System')])[2]"));
		String actualcarthometheatrename=carthometheatre.getText();
		
		Assert.assertEquals(actualhometheatrename, actualcarthometheatrename);
		driver.quit();
		}
		
	}

