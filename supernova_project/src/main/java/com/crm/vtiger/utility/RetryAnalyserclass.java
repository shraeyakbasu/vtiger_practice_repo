package com.crm.vtiger.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserclass implements IRetryAnalyzer
{

	public boolean retry(ITestResult result)
	{
		int count=0;
		int retrylimit=2;
		while(count<retrylimit) 
		{
			count++;
			return true;
		}
		return false;
	}

}
