package bdd.Drugs.PageAction;

import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.Drugs.PageElements.DrugsOthersPageLocators;
import bdd.utilities.SetupDriver;

public class DrugsOthersPageActions {

	DrugsOthersPageLocators DrugsOthersPageLocatorsObj;

	JavascriptExecutor js = (JavascriptExecutor) SetupDriver.driver;

	public DrugsOthersPageActions() {

		DrugsOthersPageLocatorsObj = new DrugsOthersPageLocators();
		PageFactory.initElements(SetupDriver.driver, DrugsOthersPageLocatorsObj);
	}

	

	public void tag2() throws InterruptedException {

		DrugsOthersPageLocatorsObj.clkMedication.click();

		Thread.sleep(1000);

		DrugsOthersPageLocatorsObj.clkAlpha.click();

		DrugsOthersPageLocatorsObj.clkAbilify.click();

	}

	public void tag3() throws InterruptedException {

		DrugsOthersPageLocatorsObj.clkMore.click();

		DrugsOthersPageLocatorsObj.clkAntibiotics.click();

		DrugsOthersPageLocatorsObj.clkMadicationList.click();

		js.executeScript("window.scrollBy(0,300)");

		Select drop = new Select(DrugsOthersPageLocatorsObj.clkToSelect);
		drop.selectByVisibleText("tetracyclines (19)");

		DrugsOthersPageLocatorsObj.SubmitBtn.click();

		DrugsOthersPageLocatorsObj.ClkOnDrug.click();

		System.out.println(SetupDriver.driver.getTitle());

	}

	public void tag4() {
		DrugsOthersPageLocatorsObj.ClkOnPricingCouponGuide.click();
		DrugsOthersPageLocatorsObj.ClkOnAndrogel.click();
		System.out.println(SetupDriver.driver.getTitle());

	}

	public void tag5() throws InterruptedException {
		DrugsOthersPageLocatorsObj.ClkTreatmentOptions.click();

		DrugsOthersPageLocatorsObj.putTexta.sendKeys("a");

		Select drop = new Select(DrugsOthersPageLocatorsObj.clkToSelect);
		drop.selectByVisibleText("Abdominal Adhesions");

		System.out.println(SetupDriver.driver.getTitle());
	}

}
