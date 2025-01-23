package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass{

	public static void click(WebElement wb)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.click();
		}
	}
	
	public static void sendKeys(WebElement wb, String value)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
}
