package com.testng_pgm;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer{

	int i=0;
		
	public boolean retry(ITestResult result) {
		if(i <= 5) {//1<=5; 2<=5; 3<=5
			i++;
			return true;
		}
		
		return false;
	}
	

	
	
	
	
	

}
