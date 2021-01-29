package bdd.Drugs.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PilldentifierLocators {
	
	@FindBy(xpath="//*[@id='header']/div/div/div/nav/ul/li[2]/a")
	public WebElement clickPhillIdentifierButton;

	@FindBy(xpath="//*[@id='content']/div[2]/form/div[2]/a")
	public WebElement clkOnAccept;

	@FindBy(xpath="//h1[contains(text(),'Pill Identifier')]")
	public WebElement txtAssert;

	}


