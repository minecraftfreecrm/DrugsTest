package bdd.runners;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, 
glue = { "bdd.stepDef", "bdd.utilities" }, 
tags = "@Sprint1,@Sprint2" , 
plugin = { "pretty", "html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
dryRun=false,
//strict=true,
//name="Common diseases and conditions",
monochrome = true)

public class RunnerClass extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("Config/Config.xml"));

	}

}