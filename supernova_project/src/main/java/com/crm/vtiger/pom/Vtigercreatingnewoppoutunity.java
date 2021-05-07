package com.crm.vtiger.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.utility.ExcelUtility;
import com.crm.vtiger.utility.FileUtility;
import com.crm.vtiger.utility.JavaUtility;
import com.crm.vtiger.utility.WebdriverUtility;

public class Vtigercreatingnewoppoutunity
{
	public WebDriver driver;
	public JavaUtility jutil=new JavaUtility();
	public WebdriverUtility wutil=new WebdriverUtility();
	public FileUtility futil=new FileUtility();
	public ExcelUtility xutil=new ExcelUtility();
	public String opponame;
	
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement opportunitynametext;
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement organizationselectbutton;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement assignedtogroupradio;
	
	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement groupdropdown;
	
	@FindBy(xpath="//a[contains(text(),'skillary705')]")
	private WebElement organizationname;
	
	@FindBy(xpath="(//img[@alt='Select'])[2]")
	private WebElement campaignsourceselectionbutton;
	
	@FindBy(xpath="//a[contains(text(),'samsung mobile')]")
	private WebElement campaignname;
	
	@FindBy(xpath="//select[@name='sales_stage']")
	private WebElement salesstagedropdown;
	
	

	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement savebutton;
	
	public WebElement getOpportunitynametext()
	{
		return opportunitynametext;
	}
	
	public WebElement getSalesstagedropdown()
	{
		return salesstagedropdown;
	}

	public WebElement getOrganizationselectbutton() 
	{
		return organizationselectbutton;
	}

	public WebElement getAssignedtogroupradio() 
	{
		return assignedtogroupradio;
	}

	public WebElement getGroupdropdown()
	{
		return groupdropdown;
	}

	public WebElement getSavebutton() 
	{
		return savebutton;
	}
	
	public WebElement getOrganizationname()
	{
		return organizationname;
	}

	public WebElement getCampaignsourceselectionbutton()
	{
		return campaignsourceselectionbutton;
	}

	public WebElement getCampaignname() 
	{
		return campaignname;
	}
	
	public Vtigercreatingnewoppoutunity(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createoppurtunity(String opponame) throws IOException
	{
	   
		opportunitynametext.sendKeys(opponame);
		getOrganizationselectbutton().click();
		wutil.switchwindow(driver, "Accounts&action");
		getOrganizationname().click();
		wutil.switchwindow(driver, "Potentials&action");
		assignedtogroupradio.click();
		getGroupdropdown().click();
		wutil.selectbytext(groupdropdown, "Team Selling");
		getCampaignsourceselectionbutton().click();
		wutil.switchwindow(driver, "Campaigns&action");
		getCampaignname().click();
		wutil.switchwindow(driver, "Potentials&action");
		getSavebutton().click();
	}
	
	public void createopportunitywithsalesstageprospectus(String opponame1) throws IOException
	{
		    
			opportunitynametext.sendKeys(opponame1);
			getOrganizationselectbutton().click();
			wutil.switchwindow(driver, "Accounts&action");
			getOrganizationname().click();
			wutil.switchwindow(driver, "Potentials&action");
			assignedtogroupradio.click();
			getGroupdropdown().click();
			wutil.selectbytext(groupdropdown, "Team Selling");
			getSalesstagedropdown().click();
			wutil.selectbyvalue(salesstagedropdown, "Prospecting");
			getSavebutton().click();
			
	}

	public void createopportunitywithsalesstagequalification(String opponame2) throws IOException
	{
		 
			opportunitynametext.sendKeys(opponame2);
			getOrganizationselectbutton().click();
			wutil.switchwindow(driver, "Accounts&action");
			getOrganizationname().click();
			wutil.switchwindow(driver, "Potentials&action");
			assignedtogroupradio.click();
			getGroupdropdown().click();
			wutil.selectbytext(groupdropdown, "Team Selling");
			getSalesstagedropdown().click();
			wutil.selectbyvalue(salesstagedropdown, "Qualification");
			getSavebutton().click();
	}
	
	public void createopportunitywithsalesstageneedanalysis(String opponame3) throws IOException
	{
		 
			opportunitynametext.sendKeys(opponame3);
			getOrganizationselectbutton().click();
			wutil.switchwindow(driver, "Accounts&action");
			getOrganizationname().click();
			wutil.switchwindow(driver, "Potentials&action");
			assignedtogroupradio.click();
			getGroupdropdown().click();
			wutil.selectbytext(groupdropdown, "Team Selling");
			getSalesstagedropdown().click();
			wutil.selectbyvalue(salesstagedropdown, "Needs Analysis");
			getSavebutton().click();
	}
	
	public void createopportunitywithsalesstagevalueproposition(String opponame4) throws IOException
	{
		 
			opportunitynametext.sendKeys(opponame4);
			getOrganizationselectbutton().click();
			wutil.switchwindow(driver, "Accounts&action");
			getOrganizationname().click();
			wutil.switchwindow(driver, "Potentials&action");
			assignedtogroupradio.click();
			getGroupdropdown().click();
			wutil.selectbytext(groupdropdown, "Team Selling");
			getSalesstagedropdown().click();
			wutil.selectbyvalue(salesstagedropdown, "Value Proposition");
			getSavebutton().click();
	}
}
