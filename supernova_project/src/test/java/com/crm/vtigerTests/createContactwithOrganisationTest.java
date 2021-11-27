package com.crm.vtigerTests;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createContactwithOrganisationTest 
{
	@Test
	public void createContactwithOrganisation()
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
		//clicking on the contact link
				driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
				driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		//creating the user
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("basu");
		//selecting the organisation
				driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
		//navigating to the new window
				Set<String> windowhandles=driver.getWindowHandles();
				ArrayList<String> al=new ArrayList<String>(windowhandles);
				driver.switchTo().window(al.get(1));
				driver.findElement(By.xpath("//a[contains(text(),'skillary950')]")).click();
				driver.switchTo().window(al.get(0));
				driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
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
