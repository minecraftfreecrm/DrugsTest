package bdd.Drugs.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DrugsLoginPageLocators {

	// login Link
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/a[2]")
	public WebElement lnklogin;

	@FindBy(name = "username")
	public WebElement lgnUsername;

	@FindBy(name = "password")
	public WebElement lgnPassword;

	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/div[3]/input")
	public WebElement lgnSubmit;

	@FindBy(xpath = "//b[contains(text(),'Thank you for Loggin.')]")
	public WebElement thankuText;

}
