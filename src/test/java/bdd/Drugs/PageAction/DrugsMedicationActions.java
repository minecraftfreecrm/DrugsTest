package bdd.Drugs.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bdd.Drugs.PageElements.DrugsMedicationLocators;
import bdd.utilities.SetupDriver;

public class DrugsMedicationActions {

	DrugsMedicationLocators drugsMedicationObj;

	WebDriver driver;

	public DrugsMedicationActions() {
		drugsMedicationObj = new DrugsMedicationLocators();
		PageFactory.initElements(SetupDriver.driver, drugsMedicationObj);

	}

	public void visitDrugsHomePage() {
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.get("https://www.drugs.com/");
		SetupDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public void clkOnMedication() {
		drugsMedicationObj.clickMedicationButton.click();

	}

	public void clkSideEffects() {

	}

	public void landOnDNEffectsPage() {
		String confMsg = drugsMedicationObj.txtAssert.getText();
		Assert.assertEquals(confMsg, "Drug Index A to Z");

	}

}
