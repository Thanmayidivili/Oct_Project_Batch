package com.pojoclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public static WebDriver driver; //Null Driver
	
	@FindBy(id="location")
	private WebElement location;

	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}

	public WebElement getLocation() {
		return location;
	}
	
	
	
	

}
