package bdd.Drugs.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsHomePageLocators {
	
	@FindBy(className="ddc-icon-next")
	public WebElement ClkLeftArrow;
	
	@FindBy(linkText="Conditions")
	public WebElement ClkCondotion;
	
}
