package Steps;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageStep extends BaseClass{

	private static ContactPage page;
	@When("user click on create contact button")
	public void user_click_on_create_contact_button() {
	     page = new ContactPage();
	    page.clickOnCreateContact();
	   
	}
	@When("user enter first name and last name")
	public void user_enter_first_name_and_last_name() {
	    page.enterValidFnameLname("Rohit", "Jadhav");
	   
	}
	@When("user enter email and select status")
	public void user_enter_email_and_select_status() {
	    page.enterEmailAndStatus("rohit@gamil.com", "Active");
	   
	}
	@Then("click on save button")
	public void click_on_save_button() {
	   page.clickOnSaveButton(); 
	   
	}
	
	
}
