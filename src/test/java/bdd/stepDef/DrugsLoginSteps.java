package bdd.stepDef;


import bdd.Drugs.PageAction.DrugsLoginPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugsLoginSteps {

	DrugsLoginPageActions drugsLoginPageActionsObj = new DrugsLoginPageActions();
	//DrugsDraft drussobj = new DrugsDraft();

	@Given("^Land to drugs\\.com homepage$")
	public void land_to_drugs_com_homepage() throws Throwable {
		drugsLoginPageActionsObj.loadDrugsFrontPage();
	}

	@When("^Navigate to Sign-On page$")
	public void navigate_to_Sign_On_page() throws Throwable {
		drugsLoginPageActionsObj.nevigateLoginPage();
	}

	@When("^Fill login form with valid username and password$")
	public void fill_login_form_with_valid_username_and_password() throws Throwable {
		drugsLoginPageActionsObj.fillOutLoginForm();
	}

	@When("^Click login button$")
	public void click_login_button() throws Throwable {
		drugsLoginPageActionsObj.submitLoginPage();
	}

	@Then("^Verify login successfully$")
	public void verify_login_successfully() throws Throwable {
//		drugsLoginPageActionsObj.verifyLoginPage();
//		//drugsobj.practiceHoverOver();
	}

}
