package bdd.Drugs.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsHomePageLocators {
	
	@FindBy(className="ddc-icon-next")
	public WebElement ClkLeftArrow;
	
	@FindBy(linkText="Conditions")
	public WebElement ClkCondotion;
	
	//tag1
		@FindBy(linkText="A")
		public WebElement ClkDiabetes;
		
		@FindBy(linkText="Type 1 Diabetes")
		public WebElement ClickType1;
		
		@FindBy(className="ddc-text-size-small")
		public WebElement Verify;
}
