package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.DropDownHelper;
import UtilityLayer.WebElementHelper;

public class ContactPage extends BaseClass {

	@FindBy(xpath = "//button[text()='Create']/parent::a")
	private WebElement createButton;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement fname;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lname;

	@FindBy(xpath = "//input[@placeholder='Email address']")
	private WebElement email;

	@FindBy(xpath = "//div[@name='status']/child::div/following-sibling::i")
	private WebElement statusDD;

	@FindBys(@FindBy(xpath = "//div[@class='visible menu transition']/child::div"))
	private List<WebElement> StatusList;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveBtn;

	public ContactPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickOnCreateContact() {
		WebElementHelper.click(createButton);
	}

	public void enterValidFnameLname(String Fname, String Lname) {
		WebElementHelper.sendKeys(fname, Fname);
		WebElementHelper.sendKeys(lname, Lname);
	}

	public void enterEmailAndStatus(String Email, String expectedValue) {

		WebElementHelper.sendKeys(email, Email);
		WebElementHelper.click(statusDD);
		DropDownHelper.selectValue(StatusList, expectedValue);

	}
	
	public void clickOnSaveButton()
	{
		WebElementHelper.click(saveBtn);
	}
}