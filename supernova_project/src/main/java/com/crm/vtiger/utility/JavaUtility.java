package com.crm.vtiger.utility;

import java.util.Date;
import java.util.Random;

public class JavaUtility 
{
	/* generate random data
	 * @shraeyak 
	 */
	public String getrandomdata()
	{
		Random rand=new Random();
		int number=rand.nextInt(2000);
		String snumber=""+number;
		return snumber;
	}
	
	/* generate current date
	 * @shraeyak
	 */
	public String getcurrentdate()
	{
		Date date=new Date();
		String sdate=date.toString();
		return sdate;
	}

}
