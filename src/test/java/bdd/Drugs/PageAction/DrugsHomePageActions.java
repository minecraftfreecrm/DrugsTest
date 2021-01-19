package bdd.Drugs.PageAction;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bdd.Drugs.PageElements.DrugsHomePageLocators;
import bdd.utilities.SetupDriver;

public class DrugsHomePageActions {
	DrugsHomePageLocators DrugsHomePageLocatorsObj;
	JavascriptExecutor js = (JavascriptExecutor) SetupDriver.driver;
	
	public DrugsHomePageActions(){
		DrugsHomePageLocatorsObj = new DrugsHomePageLocators();
		PageFactory.initElements(SetupDriver.driver, DrugsHomePageLocatorsObj);
		
	}
	
	public void loadDrugsHomePage(){
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.get("https://www.drugs.com/");
		SetupDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void HopePageLocators() throws Exception{
	DrugsHomePageLocatorsObj.ClkLeftArrow.click();
		/*
		if(	DrugsHomePageLocatorsObj.ClkLeftArrow.isDisplayed()==true) {
		
			DrugsHomePageLocatorsObj.ClkLeftArrow.click();
		}else {
			WebDriver driver = null;
			new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(DrugsHomePageLocatorsObj.ClkLeftArrow));
			System.out.println("Waiting for 5 minutes" );
			*/
		
		
		
	/*
	 * try { DrugsHomePageLocatorsObj.ClkLeftArrow.click(); } catch (Exception ee) {
	 * if (ee.toString().contains("NoSuchElementException")) {
	 * 
	 * }
	 * 
	 * }
	 */
		//DrugsHomePageLocatorsObj.ClkCondotion.click();
		
		if(	DrugsHomePageLocatorsObj.ClkCondotion.isDisplayed()==true) {
			
			DrugsHomePageLocatorsObj.ClkCondotion.click();
		}else {
			WebDriver driver = null;
			new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(DrugsHomePageLocatorsObj.ClkCondotion));
			System.out.println("Waiting for 5 minutes" );
			
		}
		
		
		
		
	
//public void tag1() throws InterruptedException {

		
		
		DrugsHomePageLocatorsObj.ClkDiabetes.click();

		Thread.sleep(1000);

		WebElement Type1 = SetupDriver.driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/h2[29]"));
		js.executeScript("arguments[0].scrollIntoView();", Type1);

		DrugsHomePageLocatorsObj.ClickType1.click();

		Thread.sleep(2000);
		String A = DrugsHomePageLocatorsObj.Verify.getText();
		System.out.println(A);

	}
}
