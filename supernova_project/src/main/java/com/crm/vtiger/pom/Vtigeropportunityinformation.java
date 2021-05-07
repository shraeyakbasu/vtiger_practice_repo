package com.crm.vtiger.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Vtigeropportunityinformation 
{
	public WebDriver driver;
	

	@FindBy(id="mouseArea_Opportunity Name")
	private WebElement opportunitynametext;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement oppcreationsuccessmsg;
	
	public WebElement getOppcreationsuccessmsg() 
	{
		return oppcreationsuccessmsg;
	}

	public WebElement getOpportunitynametext()
	{
		return opportunitynametext;
	}
	
	public Vtigeropportunityinformation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
}
