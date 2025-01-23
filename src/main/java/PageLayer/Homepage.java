package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class Homepage extends BaseClass {
	@FindBy(xpath="")
	WebElement logo;
	
	public Homepage() {
		PageFactory.initElements(getDriver(),this);
	}
public static void logoDisplayed() {
	
	
}
	
}
