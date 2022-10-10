package com.testng_pgm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass_august.BaseClass;
import com.pom.PageObjectManager;

public class SimpleAnnotation extends BaseClass{
	
	public static WebDriver driver=BaseClass.browserName("Edge");
	public static PageObjectManager pom=new PageObjectManager(driver);
	
	//STCM
	@BeforeSuite
	private void setProperty() {
	
		System.out.println("Set Property");
	}
	
	@BeforeTest
	private void browserLaunch() {
		
		//WebDriver driver=new ChromeDriver()
		System.out.println("My browser is Edge");

	}
	
	@BeforeClass
	private void get_Url1() {
		System.out.println("Get url");
		//getUrl("https://adactinhotelapp.com/");

	}
	
	@BeforeMethod
	private void loginDetails() {
		System.out.println("Login Details");


	}
	
	@Test
	private void searchLaptop() {
		System.out.println("Laptop Search");

	}
	
	@Test
	private void mobileLaptop() {
		System.out.println("Mobile search");

	}
	
	@AfterMethod
	private void logOut() {
		System.out.println("Logout");

	}
	@AfterClass
	private void homePage() {
		System.out.println("HomePage");

	}
	
	@AfterTest
	private void closeBrowser() {
		System.out.println("Close Browser");

	}
	
	@AfterSuite
	private void deleteAllCookies() {
		System.err.println("Delete all cookies");

	}
	
	
	
	
	
	
	

}
