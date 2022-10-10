package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pojoclass.LoginPage;
import com.pojoclass.SearchPage;

public class PageObjectManager {
	
	public static WebDriver driver; // Null Driver
	private LoginPage lp;
	private SearchPage search;
	

	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public LoginPage getLp() {
		lp=new LoginPage(driver);
		return lp;
	}
	public SearchPage getSearch() {
		search=new SearchPage(driver);
		return search;
	}
	
	
	
	

}
