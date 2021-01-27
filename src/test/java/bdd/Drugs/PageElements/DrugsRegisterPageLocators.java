package bdd.Drugs.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsRegisterPageLocators {

	// First Name locators

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/a[1]")
	public WebElement navigateRegister;

	// Email locators
	@FindBy(xpath = "//input[@id='user-email']")
	public WebElement email;

	// WebElement UserName
	@FindBy(xpath = "//input[@id='user-username']")
	public WebElement UserName;

	// WebElement Password
	@FindBy(xpath = "//input[@id='user-password']")
	public WebElement Password;

	// WebElement Age
	@FindBy(xpath = "//select[@id='user-age']")
	public WebElement Age;

	// WebElement Submit
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/div[5]/input")
	public WebElement SubmitButton;
}
