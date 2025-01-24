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
	    
	   
	}
	@When("user enter first name and last name")
	public void user_enter_first_name_and_last_name() {
	    
	   
	}
	@When("user enter email and select status")
	public void user_enter_email_and_select_status() {
	    
	   
	}
	@Then("click on save button")
	public void click_on_save_button() {
	    
	   
	}
	
	
}
