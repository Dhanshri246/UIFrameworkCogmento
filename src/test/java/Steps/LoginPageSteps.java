package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass{

	protected static LoginPage login;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    BaseClass.initialization();
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String userName, String password) {
		login = new LoginPage();
	    login.loginFunctionality(userName, password);
	}
	@Then("user click on login button")
	public void user_click_on_login_button() {
	  login.clickOnLoginBtn();
	}

	
}
