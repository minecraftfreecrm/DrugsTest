package bdd.Drugs.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsMedicationLocators {
	

@FindBy(xpath="//*[@id=\"header\"]/div/div/div/nav/ul/li[1]/a")
public WebElement clickMedicationButton;

@FindBy(xpath="//*[@id=\"content\"]/div[2]/ul[2]/li[1]/a")
public WebElement clkSideEffects;

@FindBy(xpath="//*[@id=\"content\"]/div[2]/h1")
public WebElement txtAssert;

}
