package com.crm.vtiger.utility;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility 
{
	/* this method will perform implicit wait for 20seconds
	 * @shraeyak
	 * @param driver
	 */
	public void implicitlywait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/* this method will select value from dropdownlist using value
	 * @shraeyak
	 * @param element
	 * @param value
	 */
	public void selectbyvalue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	/*this method will select value from dropdownlist using text
	 * @shraeyak
	 * @param element
	 * @param text
	 */
	public void selectbytext(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/* this method will perform mousehovering over target element and then click on destination element
	 * @shraeyak
	 * @param driver
	 * @param target
	 * @param destination
	 */
	public void mousehover(WebDriver driver,WebElement target,WebElement destination)
	{
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		act.moveToElement(destination).click().perform();
		
	}
	
	/*this method will handle alert popups and click on accept
	 * @shraeyak
	 * @param driver
	 * 
	 */
	public void alertaccept(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	/*this method will handle alert popups and click on dismiss
	 * @shraeyak
	 * @param driver
	 * 
	 */
	public void alertdismiss(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	
	/* this method will perform scrolling vertically
	 * @shraeyak
	 * @param driver
	 * @param element
	 * 
	 */
	public void scrollvertically(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int y=element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")");
	}
	
	/* this method will perform scrolling horrizontally
	 * @shraeyak
	 * @param driver
	 * @param element 
	 */
	
	public void scrollhorrizontally(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int x=element.getLocation().getX();
		js.executeScript("window.scrollBy(0,"+x+")");
	}
	
	/* this method will perform switching between windows
	 * @shraeyak
	 * @param driver
	 * @param partialtitle 
	 */
	public void switchwindow(WebDriver driver,String partialtitle)
	{
		Set<String> windowhandles=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(windowhandles);
		ListIterator<String> lit=al.listIterator();
		while(lit.hasNext())
		{
			String winid=lit.next();
			driver.switchTo().window(winid);
			String title=driver.getTitle();
			if(title.contains(partialtitle))
			{
				break;
			}
			
		}
	}
	
	
	
	
	
}
