package bdd.Drugs.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsOthersPageLocators {
	
	
	
	
	
	//tag2
	@FindBy(xpath="//*[@id=\"inner-wrap\"]/div[2]/div/ul/li[1]/a/img")
	public WebElement clkMedication;
	
	@FindBy(linkText="A")
	public WebElement clkAlpha;
	
	@FindBy(linkText="Abilify")
	public WebElement clkAbilify;
	
	
	
	//tag3
	@FindBy(partialLinkText="More")
	public WebElement clkMore;
	
	@FindBy(partialLinkText="Antibiotics")
	public WebElement clkAntibiotics;
	
	@FindBy(partialLinkText="List")
	public WebElement clkMadicationList;
	
	@FindBy(xpath="//*[@id=\"category_id\"]")
	public WebElement clkToSelect;
	
	@FindBy(xpath="//*[@id=\"sortby\"]/input[2]")
	public WebElement SubmitBtn;
	@FindBy(linkText="doxycycline")
	public WebElement ClkOnDrug;
	
	
	
	//tag4
	@FindBy(partialLinkText="Pricing & Coupon Guide")
	public WebElement ClkOnPricingCouponGuide;
	@FindBy(partialLinkText="Androgel")
	public WebElement ClkOnAndrogel;
	
	
	
	
	//tag5
	@FindBy(partialLinkText="Treatment Options")
	public WebElement ClkTreatmentOptions;
	
	@FindBy(xpath="//*[@id=\"livesearch-condition\"]")
	public WebElement putTexta;
	
	
	

}
