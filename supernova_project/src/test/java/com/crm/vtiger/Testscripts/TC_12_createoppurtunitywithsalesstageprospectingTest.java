package com.crm.vtiger.Testscripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.pom.Vtigercreatingnewoppoutunity;
import com.crm.vtiger.pom.Vtigerhome;
import com.crm.vtiger.pom.Vtigeropportunity;
import com.crm.vtiger.pom.Vtigeropportunityinformation;
import com.crm.vtiger.utility.Baseclass;
import com.crm.vtiger.utility.Screenshotclass;

@Listeners(Screenshotclass.class)
public class TC_12_createoppurtunitywithsalesstageprospectingTest extends Baseclass
{
	
	@Test(groups = "regression")
	public void createoppwithsaleprospecting() throws IOException, InterruptedException
	{
		String expectedoppname=xutil.GetExcelcellvalue("opportunity",1,0)+jutil.getrandomdata();
	
		//clicking on opportunity link
		
		Vtigerhome vhome=new Vtigerhome(driver);
		vhome.getOpportunitylink().click();
		Vtigeropportunity voppt=new Vtigeropportunity(driver);
		voppt.getCreateopportunitybutton().click();
	
				
		//creating opportunity with sales stage prospectus
				
		Vtigercreatingnewoppoutunity vcno=new Vtigercreatingnewoppoutunity(driver);
		vcno.createopportunitywithsalesstageprospectus(expectedoppname);
		
		//verify opportunity name
		
		Vtigeropportunityinformation vtof=new Vtigeropportunityinformation(driver);
		String actualoppname=vtof.getOpportunitynametext().getText().replace(" ", "");
		String successmsg=vtof.getOppcreationsuccessmsg().getText();
		Boolean status=successmsg.contains(expectedoppname);
		Assert.assertEquals(actualoppname, expectedoppname);
		Assert.assertTrue(status);

		
				
		}

}
