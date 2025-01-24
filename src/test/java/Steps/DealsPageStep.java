package Steps;

import BaseLayer.BaseClass;
import PageLayer.DealsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsPageStep extends BaseClass{

	DealsPage deal;
	
	@When("user click on Deals link")
	public void user_click_on_deals_link() {
	    
		deal = new DealsPage();
		deal.clickOnDeals();
	}
	@When("user click on create deal link")
	public void user_click_on_create_deal_link() {
	    deal.clickOnCreateLink();
	    
	}
	@When("user enter valid title")
	public void user_enter_valid_title() {
	    deal.enterTitle("Buisness Deal 1");
	    
	}
	@Then("user click on save button")
	public void user_click_on_save_button() {
	    
	    deal.clickOnSave();
	}
}
