package com.testng_pgm;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = -2, invocationCount = 5)
	private void studentName() {
		System.out.println("Studen Name: Anu");
	}	
	@Ignore
	@Test(priority = -1)
	private void studentAge() {
		System.out.println("Age:15");
	}
	@Test(invocationCount = 2)
	private void studentAddress() {
		System.out.println("Chennai");

	}
	@Test(enabled = false)
	private void classTeacherDetails() {
		System.out.println("Priya");

	}
	
	

}
