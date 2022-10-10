package com.testng_pgm;

import org.testng.annotations.Test;

public class ExpectedException {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void matheMatics() {
		int a=1/0;
		
		System.out.println(a);

	}

}
