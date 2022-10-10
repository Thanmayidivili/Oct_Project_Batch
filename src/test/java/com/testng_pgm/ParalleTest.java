package com.testng_pgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParalleTest {
	
	@Test
	private void amazonSite() {
		  System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")  +"\\Driver\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");


	}
	
	@Test
	private void flipKartSite() {
		  System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")  +"\\Driver\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.com/");

	}

}
