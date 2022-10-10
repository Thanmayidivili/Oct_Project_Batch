package com.testng_pgm;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class DependsOnMethods {
	
	@Test(dependsOnMethods = "diwaliDiscount")
	private void mobileOffer() {
		System.out.println("Mobile Offer 20%");
	}
	
	@Test(timeOut = 2000)
	private void laptopOffer() throws InterruptedException {
		System.out.println("LaptopOffer 25%");
		Thread.sleep(3000);
		System.out.println("Mobile Case");

	}
	
	@Test(dependsOnMethods = "diwaliDiscount")
	private void tvOffer() {
		System.out.println("TV Offer");

	}
	
	@Test
	private void diwaliDiscount() {
		System.out.println("Diwai Fest - Mobile offer");

	}

}
