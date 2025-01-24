package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class DealsPage extends BaseClass{

	@FindBy(xpath="//span[text()='Deals']")
	private WebElement dealsLink;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement createDeal;
	
	@FindBy(name="title")
	private WebElement title;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveBtn;
	
	public DealsPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickOnDeals()
	{
		WebElementHelper.click(dealsLink);
	}
	public void clickOnCreateLink()
	{
		WebElementHelper.click(createDeal);
	}
	
	public void enterTitle(String addTitle)
	{
		WebElementHelper.sendKeys(title, addTitle);
	}
	
	public void clickOnSave()
	{
		WebElementHelper.click(saveBtn);
	}
}
