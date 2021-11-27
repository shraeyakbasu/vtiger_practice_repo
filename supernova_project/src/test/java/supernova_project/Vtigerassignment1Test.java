package supernova_project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtigerassignment1Test 
{
	@Test
	public void vtigerassignment()
	{
		//launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		//login to applications
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Organizations')])[1]")).click();
		//print name of all the organizations
		java.util.List<WebElement> elements=driver.findElements(By.xpath("//a[@title='Organizations']"));
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
		}
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
		//click on the last checkbox
		int sizes=checkboxes.size()-1;
		checkboxes.get(sizes).click();
		//click on all checkbox one by one
		for(int i=1;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		
		//logout from applications
		WebElement target=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		WebElement destination=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", destination);
		driver.quit();
		
		
	}

}
