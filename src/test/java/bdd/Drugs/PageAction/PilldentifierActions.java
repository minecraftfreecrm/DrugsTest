package bdd.Drugs.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import bdd.Drugs.PageElements.PilldentifierLocators;
import bdd.utilities.SetupDriver;

public class PilldentifierActions {
	
	PilldentifierLocators ObjPilldentifier;
	
	public PilldentifierActions (){
		ObjPilldentifier = new PilldentifierLocators();
		PageFactory.initElements(SetupDriver.driver, ObjPilldentifier);
	}
	

	public void browseHomePage() {
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.get("https://www.drugs.com/");
		SetupDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public void clkPhillIdentifier() throws InterruptedException {
		ObjPilldentifier.clickPhillIdentifierButton.click();
		Thread.sleep(5000);
		

	}

	
	public void clickOnAccept(){
		
		WebDriverWait wait = new WebDriverWait(SetupDriver.driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(ObjPilldentifier.clkOnAccept));
				
				
		ObjPilldentifier.clkOnAccept.click();
		
	}
	public void verifyPhillText() {
		String confMsg = ObjPilldentifier.txtAssert.getText();
		Assert.assertEquals(confMsg, "Pill Identifier");

	}

}
