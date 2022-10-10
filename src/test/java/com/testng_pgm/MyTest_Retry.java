package com.testng_pgm;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest_Retry {
	
	@Test
	private void methodName1() {
		String actaul="Sanvika";
		String expected="sanvika";
		Assert.assertEquals(actaul, expected);

	}
	
	@Test
	private void methodName2() {
		String actaul="Anu";
		String expected="Anu";
		Assert.assertEquals(actaul, expected);

	}
	

}
