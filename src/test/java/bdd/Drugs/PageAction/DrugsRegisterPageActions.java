package bdd.Drugs.PageAction;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.Drugs.PageElements.DrugsRegisterPageLocators;
import bdd.utilities.SetupDriver;

public class DrugsRegisterPageActions {

	DrugsRegisterPageLocators DrugsRegisterPageLocatorsObj;

	public DrugsRegisterPageActions() {
		DrugsRegisterPageLocatorsObj = new DrugsRegisterPageLocators();
		PageFactory.initElements(SetupDriver.driver, DrugsRegisterPageLocatorsObj);
	}

	public void loadDrugsHomepage() {

		SetupDriver.driver.get("https://www.drugs.com/");
	}

	public void clickDrugRegister() {
		DrugsRegisterPageLocatorsObj.navigateRegister.click();

	}

	public void fillUserInfo(String Username, String Password) throws IOException {
		DrugsRegisterPageLocatorsObj.email.sendKeys("minecraftfreecrm@gmail.com");
		DrugsRegisterPageLocatorsObj.UserName.sendKeys(Username);
		DrugsRegisterPageLocatorsObj.Password.sendKeys(Password);

		Select mydrpdwn = new Select(DrugsRegisterPageLocatorsObj.Age);
		mydrpdwn.selectByVisibleText("25-34");
	}

	public void loadDrugsHomepage2() {
		// DrugsRegisterPageLocatorsObj.SubmitButton.click();
		// SetupDrivers.driver.navigate().back();
		SetupDriver.driver.close();
	}

}
