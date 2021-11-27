package com.crm.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtigeropportunity 
{
	public WebDriver driver;
	
	@FindBy(xpath="//img[@title='Create Opportunity...']")
	private WebElement createopportunitybutton;

	public WebElement getCreateopportunitybutton() 
	{
		return createopportunitybutton;
	}
	
	public Vtigeropportunity(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	

}
