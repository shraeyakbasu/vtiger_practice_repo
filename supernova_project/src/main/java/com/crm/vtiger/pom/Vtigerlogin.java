package com.crm.vtiger.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.utility.FileUtility;
import com.crm.vtiger.utility.JavaUtility;
import com.crm.vtiger.utility.WebdriverUtility;

public class Vtigerlogin 
{
	public WebDriver driver;
	public JavaUtility jutil=new JavaUtility();
	public WebdriverUtility wutil=new WebdriverUtility();
	public FileUtility futil=new FileUtility();
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernametext;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordtext;
	
	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	public WebElement getUsernametext() 
	{
		return usernametext;
	}

	public WebElement getPasswordtext() 
	{
		return passwordtext;
	}

	public WebElement getLoginbutton() 
	{
		return loginbutton;
	}

	public Vtigerlogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws IOException
	{
		usernametext.sendKeys(futil.GetPropertyKeyValue("username"));
		passwordtext.sendKeys(futil.GetPropertyKeyValue("password"));
		loginbutton.click();
	}

	


}
