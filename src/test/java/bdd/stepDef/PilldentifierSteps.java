package bdd.stepDef;

import bdd.Drugs.PageAction.PilldentifierActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PilldentifierSteps {
	PilldentifierActions ObjPilldentifier=new PilldentifierActions();
	

    @Given("^Browse to Drugs  HomePage$")
    public void browse_to_drugs_homepage() throws Throwable {
    	ObjPilldentifier.browseHomePage();
    }

    @When("^Click on Phill Identifier button$")
    public void click_on_phill_identifier_button() throws Throwable {
    	ObjPilldentifier.clkPhillIdentifier();
    }

    @Then("^Landed Phill Identifier pages successfully$")
    public void landed_phill_identifier_pages_successfully() throws Throwable {
    	ObjPilldentifier.verifyPhillText();      
    	
    }
	

    


}
