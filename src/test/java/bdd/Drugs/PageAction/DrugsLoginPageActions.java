package bdd.Drugs.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.Drugs.PageElements.DrugsLoginPageLocators;
import bdd.utilities.SetupDriver;


public class DrugsLoginPageActions {

	DrugsLoginPageLocators drugsLoginPageLocatorsObj;

	public DrugsLoginPageActions() {
		drugsLoginPageLocatorsObj = new DrugsLoginPageLocators();
		PageFactory.initElements(SetupDriver.driver, drugsLoginPageLocatorsObj);
	}

	public void loadDrugsFrontPage() {
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.get("https://www.drugs.com/");
		SetupDriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void nevigateLoginPage() {
		drugsLoginPageLocatorsObj.lnklogin.click();
	}

	public void fillOutLoginForm() {
		drugsLoginPageLocatorsObj.lgnUsername.clear();
		drugsLoginPageLocatorsObj.lgnUsername.sendKeys("Minecraft");
		drugsLoginPageLocatorsObj.lgnPassword.clear();
		drugsLoginPageLocatorsObj.lgnPassword.sendKeys("freecrm");
	}

	public void submitLoginPage() {
		drugsLoginPageLocatorsObj.lgnSubmit.click();
		SetupDriver.driver.close();
	}

	public void verifyLoginPage() throws InterruptedException {
		
		Thread.sleep(3000);
		SetupDriver.driver.close();
//		String confMsg = drugsLoginPageLocatorsObj.thankuText.getText();
//		Assert.assertEquals(confMsg, "Thank you for Loggin.");
	}

}
