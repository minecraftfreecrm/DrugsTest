package bdd.utilities;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
public static WebDriver driver;

	
	public static void setupDriver() {

		
		WebDriverManager.chromedriver().browserVersion("88.0.4324.104").setup();       
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		options.addArguments("start-maximized");
		   options.setExperimentalOption("excludeSwitches",
				    Arrays.asList("disable-popup-blocking"));
			
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	

	public static WebDriver getDriver() {
		return driver;

	}

	public static void tearDownDriver() {
		driver.quit();
	}
	
	}






