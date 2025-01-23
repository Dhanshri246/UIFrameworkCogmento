package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class HomePage extends BaseClass{

	@FindBy(xpath="//div[@class='header item']")
	WebElement logo;
	

	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactlink;
	
	public HomePage()
	{
		PageFactory.initElements(getDriver(), this);	}



	public void checkLogoStatus()
	{
		boolean logoStatus=logo.isDisplayed();
	}


	public void clickOnContactLink()
	{
		WebElementHelper.click(contactlink);
	}

}
