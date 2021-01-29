package bdd.stepDef;

import bdd.Drugs.PageAction.DrugsMedicationActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DrugsMedicationSteps {
	DrugsMedicationActions  ObjDrugsMedication=new  DrugsMedicationActions ();
	
	@Given("^Browse to Drugs dot com HomePage$")
	public void browse_to_Drugs_dot_com_HomePage() throws Throwable {
		ObjDrugsMedication.visitDrugsHomePage();
	    
	}

	@When("^Click on Drugs and Medications button$")
	public void click_on_Drugs_and_Medications_button() throws Throwable {
		ObjDrugsMedication.clkOnMedication();
	    
	}

	@When("^Click drugs side effects link$")
	public void click_drugs_side_effects_link() throws Throwable {
		ObjDrugsMedication.clkSideEffects(); 
	    
	}

	@Then("^Landed on drugs and side effects page successfully$")
	public void landed_on_drugs_and_side_effects_page_successfully() throws Throwable {
		ObjDrugsMedication.landOnDNEffectsPage();
	    
	}


}
