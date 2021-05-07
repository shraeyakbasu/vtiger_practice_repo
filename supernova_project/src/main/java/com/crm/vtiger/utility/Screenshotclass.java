package com.crm.vtiger.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshotclass implements ITestListener
{
    
	public void onTestFailure(ITestResult result)
	{
    	String date=new JavaUtility().getcurrentdate().replace(" ", "_").replace(":","_");
		TakesScreenshot ts=(TakesScreenshot)Baseclass.sdriver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(srcfile, new File("./failedscreenshot/"+result.getMethod().getMethodName()+date+".png"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
