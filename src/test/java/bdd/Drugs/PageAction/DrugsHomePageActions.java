package bdd.Drugs.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.Drugs.PageElements.DrugsHomePageLocators;
import bdd.utilities.SetupDriver;

public class DrugsHomePageActions {
	DrugsHomePageLocators DrugsHomePageLocatorsObj;
	
	public DrugsHomePageActions(){
		DrugsHomePageLocatorsObj = new DrugsHomePageLocators();
		PageFactory.initElements(SetupDriver.driver, DrugsHomePageLocatorsObj);
		
	}
	
	public void loadDrugsHomePage(){
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.get("https://www.drugs.com/");
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void HopePageLocators(){
		DrugsHomePageLocatorsObj.ClkLeftArrow.click();
		DrugsHomePageLocatorsObj.ClkCondotion.click();
	}
	
	
}
