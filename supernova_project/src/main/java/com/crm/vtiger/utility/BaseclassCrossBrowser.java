package com.crm.vtiger.utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassCrossBrowser
{
	public JavaUtility jutil=new JavaUtility();
	public WebdriverUtility wutil=new WebdriverUtility();
	public FileUtility futil=new FileUtility();
	 public WebDriver driver;
	 
	@Parameters("browser")
	@BeforeClass(groups = {"smoke","regression"})
	public void openbrowser(String browser) throws IOException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		wutil.implicitlywait(driver);
		driver.manage().window().maximize();
		driver.get(futil.GetPropertyKeyValue("url"));
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			wutil.implicitlywait(driver);
			driver.manage().window().maximize();
			driver.get(futil.GetPropertyKeyValue("url"));
		}
	}
	
	@BeforeMethod(groups = {"smoke","regression"})
	public void login() throws IOException
	{
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(futil.GetPropertyKeyValue("username"));
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(futil.GetPropertyKeyValue("password"));
		driver.findElement(By.id("submitButton")).click();
	}
	
	@AfterMethod(groups = {"smoke","regression"})
	public void logout()
	{
		WebElement target=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
        WebElement destination=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
		wutil.mousehover(driver, target, destination);
	}
	
	@AfterClass(groups = {"smoke","regression"})
	public void closebrowser()
	{
		driver.quit();
	}

}
