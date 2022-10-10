package com.testng_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass_august.BaseClass;
import com.pom.PageObjectManager;

public class DataProvide extends BaseClass{
	
	


	
	@org.testng.annotations.DataProvider(name="logindetails")
	private Object[][] credenTials() {
		Object[][] data={
				{"Anu","anu123",
				 "admin", "admin123",
				 "arvind19","12345678"
				}
				
		    };
		
		return data; 
	}
	
	
	
	@Test(dataProvider = "logindetails")
	private void loginScenario(String Uname, String Pass) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  +"\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys(Uname);
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(Pass);
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		driver.close();


	}
	
	

}
