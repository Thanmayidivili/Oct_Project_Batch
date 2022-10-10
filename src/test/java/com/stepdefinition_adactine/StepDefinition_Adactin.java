package com.stepdefinition_adactine;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.baseclass_august.BaseClass;
import com.helperfile.FileReadManager;
import com.pom.PageObjectManager;
import com.runnerfile_adactin.Adactin_Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Adactin extends BaseClass {
	public static WebDriver driver =Adactin_Runner.driver;
	
	public static PageObjectManager pom=new PageObjectManager(driver);
	

	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Name: " +name);

	}
	
	@After
	public void afterHooks(Scenario s) {
		String status = s.getStatus();
		System.out.println("Status: " +status);

	}
	
	
	
	@Given("^User is enter the URL$")
	public void user_is_enter_the_URL() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
	}

	@When("^User is enter the \"([^\"]*)\" in Username Field$")
	public void user_is_enter_the_in_Username_Field(String arg1) throws Throwable {
	    inputText(pom.getLp().getUsername(), arg1);
	}

	@And("^User is enter the \"([^\"]*)\" in Password Field$")
	public void user_is_enter_the_in_Password_Field(String arg1) throws Throwable {
	    inputText(pom.getLp().getPassword(), arg1);
	}
	@Then("^User is click on Login Button$")
	public void user_is_click_on_Login_Button() throws Throwable {
		clickButton(pom.getLp().getLogin());
	}

	@When("^User is select the Location$")
	public void user_is_select_the_Location() throws Throwable {
		dropDown(pom.getSearch().getLocation(), "visibletext", "London");

	}

	@And("^User is selcet the Hotel Name$")
	public void user_is_selcet_the_Hotel_Name() throws Throwable {
	    
	}


	
	

}
