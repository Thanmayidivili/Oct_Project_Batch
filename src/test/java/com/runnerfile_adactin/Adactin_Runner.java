package com.runnerfile_adactin;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass_august.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\AdactinHotel.feature",
				 glue = "com.stepdefinition_adactine",
				 monochrome = true, // remove the special character from the console
				 tags = {"@nandhu","~@run"},// specific scenarios i can able to run
				 strict = true, // after run 
				 dryRun = false, // before run
				 plugin = {//"pretty",
						   "html:CucumberReport/Adactin",
						   "com.cucumber.listener.ExtentCucumberFormatter:CucumberReport/Adactin_extents.html",
						 	"json:CucumberReport/AdactinNew.json"						 
				 }				
		)

public class Adactin_Runner {	
	public static WebDriver driver; // Null Driver
	
	@BeforeClass
	public static void SetUp() {
		driver=BaseClass.browserName("Edge");

	}	
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
	
	
	

}
