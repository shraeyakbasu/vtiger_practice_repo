package supernova_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2TYSS110621
{
	@Test
	public void assignment2tyss110621()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com");
		Actions act=new Actions(driver);
		
		WebElement brand=driver.findElement(By.xpath("//a[.='brands']"));
		WebElement lakmebrand=driver.findElement(By.xpath("(//a[.='Lakme'])[1]"));
		
		String expectedlakmebrand=lakmebrand.getText();
		
		act.moveToElement(brand).perform();
		act.moveToElement(lakmebrand).click().perform();
		
		driver.findElement(By.xpath("(//div[.='Color'])[1]")).click();
		List<WebElement> colours=driver.findElements(By.xpath("//span[@class='name']"));
		for(int i=0;i<colours.size();i++)
		{
			if(colours.get(i).getText().equalsIgnoreCase("pink"))
			{
				colours.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[.='Lakme 9 to 5 Weightless Matte Mousse Lip & Cheek Color - Blu...']")).click();
		
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		driver.switchTo().window(al.get(1));
		
		WebElement selectedcolour=driver.findElement(By.xpath("//select[@title='Lakme 9 to 5 Weightless Matte Mousse Lip & Cheek Color - Blush Velvet']"));
		
		Select sel=new Select(selectedcolour);
		sel.selectByVisibleText("Scarlet Plume");
		
		WebElement header=driver.findElement(By.xpath("//h1[@itemprop='name']"));
		String headertitle=header.getText();
		
		if(headertitle.contains("Scarlet Plume"))
		{
			System.out.println("right coloured element got selected");
		}
		else
		{
			System.out.println("right coloured element not selected");
		}
		
		WebElement addtobagbutton=driver.findElement(By.xpath("(//button[@class='combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  '])[1]"));
		addtobagbutton.click();
		
		driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
		WebElement cartitems=driver.findElement(By.xpath("//div[@class='product-name']"));
		String actualcartitems=cartitems.getText();
		
		//Assert.assertEquals(headertitle, actualcartitems);
		if(headertitle.contains(actualcartitems))
		{
			System.out.println("right item found in cart");
		}
		else
		{
			System.out.println("right item not found in cart");
		}
		
		driver.quit();
		

	}

}
