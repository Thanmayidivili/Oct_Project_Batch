package com.baseclass_august;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver; //Null Driver	
	public static WebDriver browserName(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  +"\\Driver\\chromedriver1.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")  +"\\Driver\\firefoxdriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("EDGE")){
			  System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")  +"\\Driver\\msedgedriver.exe");
			
			  driver = new EdgeDriver();
		}
				
				
		driver.manage().window().maximize();
		return driver;
		
	}
	
	//login.click();
	public static void clickButton(WebElement element) {
		element.click();
	}
	
	//username.sendKeys("arvind19");
	public static void inputText(WebElement element, String input) {
		element.sendKeys(input);

	}
	//driver.get("https://adactinhotelapp.com/");
	public static void getUrl(String url) {	
		driver.get(url);
	}
	
	//driver.close();
	public static void close() {
		driver.close();

	}
	
	public static void dropDown(WebElement element,String typ, String inputvalue) {
		Select s=new Select(element);

		if(typ.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(inputvalue);
		}
		
		else if(typ.equalsIgnoreCase("byvalue")) {
			s.selectByValue(inputvalue);
			
		}
		
		
		else if(typ.equalsIgnoreCase("ByIndex")) {
			
			int input = Integer.parseInt(inputvalue);
			s.selectByIndex(input);
			
		}
		
		
		
	}
	
	
	

}
