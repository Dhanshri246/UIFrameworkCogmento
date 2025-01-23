package Steps;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass {

	protected static HomePage page;
	@When("user check logo status")
	public void user_check_logo_status() {
	    page= new HomePage();
		page.checkLogoStatus();
	}

	@Then("user click on contact link")
	public void user_click_on_contact_link() {
		page.clickOnContactLink();
	}

}
