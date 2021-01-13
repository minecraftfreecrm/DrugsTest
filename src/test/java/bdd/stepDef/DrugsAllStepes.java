package bdd.stepDef;

import bdd.Drugs.PageAction.DrugsOthersPageActions;
import bdd.Drugs.PageAction.DrugsHomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugsAllStepes {

	DrugsHomePageActions DrugsHomePageActionsObj = new DrugsHomePageActions();
	DrugsOthersPageActions DrugsOthersPageActionsObj = new DrugsOthersPageActions();

	@Given("^Browse to Drugs\\.com$")
	public void browse_to_Drugs_com() throws Throwable {
		DrugsHomePageActionsObj.loadDrugsHomePage();
	}
	@When("^Click on the right arrow sign$")
	public void click_on_the_right_arrow_sign() throws Throwable {
		DrugsHomePageActionsObj.HopePageLocators();
	}
	@When("^Click on Condition & Disease  link$")
	public void click_on_Condition_Disease_link() throws Throwable {
		DrugsHomePageActionsObj.HopePageLocators();;
	}
	
	
	
	//tag1
	@When("^Click on any Common  diseases and conditions$")
	public void click_on_any_Common_diseases_and_conditions() throws Throwable {
		DrugsOthersPageActionsObj.tag1();
	}
	@When("^Scroll down to find the Type (\\d+) Support link$")
	public void scroll_down_to_find_the_Type_Support_link(int arg1) throws Throwable {
		DrugsOthersPageActionsObj.tag1();
	}
	@When("^Click on the Type (\\d+) Support link$")
	public void click_on_the_Type_Support_link(int arg1) throws Throwable {
		DrugsOthersPageActionsObj.tag1();
	}
	@Then("^Verify with Related terms title$")
	public void verify_with_Related_terms_title() throws Throwable {
		DrugsOthersPageActionsObj.tag1();
	}
	
	
	
	//tag2
	@When("^Click on the Drug and Medications Button$")
	public void click_on_the_Drug_and_Medications_Button() throws Throwable {
		DrugsOthersPageActionsObj.tag2();
	}
	@When("^Click on any alphabet to Browse Alphabetically$")
	public void click_on_any_alphabet_to_Browse_Alphabetically() throws Throwable {
		DrugsOthersPageActionsObj.tag2();
	}
	@Then("^Click on the Medication$")
	public void click_on_the_Medication() throws Throwable {
		DrugsOthersPageActionsObj.tag2();
	}

	
	
	
	//tag3
	@When("^Click on More Button$")
	public void click_on_More_Button() throws Throwable {
		DrugsOthersPageActionsObj.tag3();
	}
	@When("^Click on the Antibiotics link$")
	public void click_on_the_Antibiotics_link() throws Throwable {
		DrugsOthersPageActionsObj.tag3();
	}
	@When("^Click on the medication list$")
	public void click_on_the_medication_list() throws Throwable {
		DrugsOthersPageActionsObj.tag3();
	}
	@When("^Select Drug class from the dropdown$")
	public void select_Drug_class_from_the_dropdown() throws Throwable {
		DrugsOthersPageActionsObj.tag3();
	}
	@When("^Click on the update$")
	public void click_on_the_update() throws Throwable {
		DrugsOthersPageActionsObj.tag3();
	}
	@When("^Click on Medication$")
	public void click_on_Medication() throws Throwable {
		DrugsOthersPageActionsObj.tag3();
	}
	@Then("^Verify with page URL$")
	public void verify_with_page_URL() throws Throwable {
		DrugsOthersPageActionsObj.tag3();
	}
	
	
	
	
	//tag4
	@When("^Click on the Pricing & Coupon Guide link$")
	public void click_on_the_Pricing_Coupon_Guide_link() throws Throwable {
		DrugsOthersPageActionsObj.tag4();
	}
	@When("^Click on the medication name$")
	public void click_on_the_medication_name() throws Throwable {
		DrugsOthersPageActionsObj.tag4();
	}
	@Then("^Verify with medication price$")
	public void verify_with_medication_price() throws Throwable {
		DrugsOthersPageActionsObj.tag4();
	}

	
	
	
	
	//tag5
	@When("^Click on the Treatment Options link$")
	public void click_on_the_Treatment_Options_link() throws Throwable {
		DrugsOthersPageActionsObj.tag5();
	}
	@When("^Type the condition$")
	public void type_the_condition() throws Throwable {
		DrugsOthersPageActionsObj.tag5();
	}
	@When("^Select a condition$")
	public void select_a_condition() throws Throwable {
		DrugsOthersPageActionsObj.tag5();
	}
}
