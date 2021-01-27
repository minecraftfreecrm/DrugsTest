package bdd.Drugs.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsHomePageLocators {
	
	@FindBy(className="ddc-icon-next")
	public WebElement ClkLeftArrow;
	
	//@FindBy(linkText="Conditions")"//body/div[@id='wrap']/div[@id='inner-wrap']/div[2]/div[1]/ul[1]/li[5]/a[1]/img[1]")
	@FindBy(xpath= "//*[contains(text(),'Conditions ')]")
	public WebElement ClkCondotion;
	
	//tag1
		@FindBy(linkText="A")
		public WebElement ClkDiabetes;
		
		@FindBy(linkText="Type 1 Diabetes")
		public WebElement ClickType1;
		
		@FindBy(className="ddc-text-size-small")
		public WebElement Verify;
}
