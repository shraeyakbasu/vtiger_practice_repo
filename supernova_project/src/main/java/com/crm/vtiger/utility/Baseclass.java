package com.crm.vtiger.utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.vtiger.pom.Vtigerhome;
import com.crm.vtiger.pom.Vtigerlogin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass
{
	public JavaUtility jutil=new JavaUtility();
	public WebdriverUtility wutil=new WebdriverUtility();
	public FileUtility futil=new FileUtility();
	public ExcelUtility xutil=new ExcelUtility();
	 public WebDriver driver;
	 public static WebDriver sdriver;
	 
	
	@BeforeClass(groups = {"smoke","regression"})
	public void openbrowser() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		sdriver=driver;
		wutil.implicitlywait(driver);
		driver.manage().window().maximize();
		driver.get(futil.GetPropertyKeyValue("url"));
		
	}
	
	@BeforeMethod(groups = {"smoke","regression"})
	public void login() throws IOException
	{
		Vtigerlogin vlogin=new Vtigerlogin(driver);
		vlogin.login();
	}
	
	@AfterMethod(groups = {"smoke","regression"})
	public void logout()
	{
		Vtigerhome vhome=new Vtigerhome(driver);
		vhome.logout();
	}
	
	@AfterClass(groups = {"smoke","regression"})
	public void closebrowser()
	{
		driver.quit();
	}

}
