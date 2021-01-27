package bdd.stepDef;



import bdd.Drugs.PageAction.DrugsRegisterPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugsRegisterSteps {

	DrugsRegisterPageActions DrugsRegisterPageActionsObj = new DrugsRegisterPageActions();
	

	@Given("^Browse to drugs homepage$")
	public void browse_to_drugs_homepage() throws Throwable {
		DrugsRegisterPageActionsObj.loadDrugsHomepage();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
		DrugsRegisterPageActionsObj.clickDrugRegister();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {

	}

	@When("^Complete creating account with \"([^\"]*)\" with \"([^\"]*)\"$")
	public void complete_creating_account_with_with(String Username, String Password) throws Throwable {
		DrugsRegisterPageActionsObj.fillUserInfo(Username, Password);
	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {
		DrugsRegisterPageActionsObj.loadDrugsHomepage2();

	}

}
