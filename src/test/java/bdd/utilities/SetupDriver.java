package bdd.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupDriver {
public static WebDriver driver;

	
	public static void setupDriver() {

		System.setProperty("webdriver.chrome.driver", "C:/TTSoftware/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	

	public static WebDriver getDriver() {
		return driver;

	}

	public static void tearDownDriver() {
		driver.quit();
	}
	
	}






