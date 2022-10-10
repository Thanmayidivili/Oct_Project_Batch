package com.testng_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Annotation {
	
	
	@Test
	@Parameters({"Edge"})
	private void credenTial(@Optional("admin") String user) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("arvind19");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("12345678");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();


	}
	
	
	@Test
	@Parameters({"chrome"})
	private void credenTial1(@Optional("admin") String user, @Optional("admin123") String pass) {
		System.out.println("Username: " +user);
		System.out.println("Password: " +pass);

	}

}
