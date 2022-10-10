package com.testng_pgm;

import org.testng.annotations.Test;

public class GroupingPgm {
	
	@Test(groups = "Sports")
	private void chessGame() {
		System.out.println("Chess");

	}
	
	@Test(groups = "Sports")
	private void cricketGame() {
		System.out.println("cricketGame");

	}
	
	@Test(groups = "Social")
	private void faceBook() {
		System.out.println("FB");

	}
	
	
	@Test(groups = "Social")
	private void instaGram() {
		System.out.println("Insta");

	}
	
	
	@Test(groups = "Sports")
	private void basketBall() {
		System.out.println("BasketBall");

	}
	
	
	@Test(groups = "Course")
	private void pHp() {
		System.out.println("PHP");

	}
	
	
	@Test(groups = "Course")
	private void seleNium() {
		System.out.println("Selenium");

	}
	
	@Test(groups = "Books")
	private void libraryBooks() {
		System.out.println("Book");

	}
	
	@Test(groups = "Books")
	private void schoolBooks() {
		System.out.println("School Book");

	}

}
