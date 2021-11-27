package com.crm.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.utility.FileUtility;
import com.crm.vtiger.utility.JavaUtility;
import com.crm.vtiger.utility.WebdriverUtility;

public class Vtigerhome
{
	public WebDriver driver;
	public JavaUtility jutil=new JavaUtility();
	public WebdriverUtility wutil=new WebdriverUtility();
	public FileUtility futil=new FileUtility();
	
	@FindBy(xpath="(//img[@style='padding: 0px;padding-left:5px'])[1]")
	private WebElement administratorimg;
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	private WebElement signoutlink;
	
	@FindBy(xpath="(//a[contains(text(),'Opportunities')])[1]")
	private WebElement opportunitylink;
	
	public WebElement getOpportunitylink() 
	{
		return opportunitylink;
	}

	public WebElement getAdministratorimg() 
	{
		return administratorimg;
	}

	public WebElement getSignoutlink() 
	{
		return signoutlink;
	}
	
	public Vtigerhome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		wutil.mousehover(driver, administratorimg, signoutlink);
	}

	
	

}
