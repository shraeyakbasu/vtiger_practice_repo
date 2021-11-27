package com.crm.vtigerTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createOrganisationwithIndustryTest 
{
	@Test
	public void createOrganisationwithIndustry() throws InterruptedException
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
//click on organization link
		driver.findElement(By.xpath("(//a[contains(text(),'Organizations')])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//creating the organisation
		try
		{
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("skillary2001");
//selecting the industry
		WebElement element=driver.findElement(By.xpath("//select[@name='industry']"));
		Select sel=new Select(element);
		sel.selectByValue("Banking");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{   
			System.out.println("abc");
            Alert alt=driver.switchTo().alert();
			alt.accept();
			
		}
//quiting the application
		WebElement target=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		WebElement destination=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", destination);
//closing the browser
		driver.quit();

	}

}
