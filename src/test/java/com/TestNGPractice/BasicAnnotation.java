package com.TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
	@BeforeSuite
	public void getBeforeSuite() {
		System.out.println("Run getBeforeSuite method");    
	}
	@BeforeTest
	public void getBeforeTest() {
		System.out.println("Run getBeforeTest method");    
	}
	@BeforeClass
	public void getBeforeClass() {
		System.out.println("Run getBeforeClass method");    
	}
	@BeforeMethod
	public void getBeforeMethod() {
		System.out.println("Run getBeforeMethod method");    
	}
	@Test
	public void getTest() {
		System.out.println("Run getTest method");    
	}
	@AfterMethod
	public void getAfterMethod() {
		System.out.println("Run getAfterMethod method");    
	}
	@AfterClass
	public void getAfterClass() {
		System.out.println("Run getAfterClass method");    
	}
	@AfterTest
	public void getAfterTest() {
		System.out.println("Run getAfterTest method");    
	}
	@AfterSuite
	public void getAfterSuite() {
		System.out.println("Run getAfterSuite method");    
	}
	//I'm using same annotaion for different methods,its possible.
	//sequence automaticall corrected on console when i run .
	@BeforeTest
	public void getBeforeTest2() {
		System.out.println("Run getBeforeTest2 method");    
	}
	@BeforeTest
	public void getBeforeTest3() {
		System.out.println("Run getBeforeTest3 method");    
	}
	@AfterMethod
	public void getAfterMethod2() {
		System.out.println("Run getAfterMethod2 method");    
	}
	@AfterMethod
	public void getAfterMethod3() {
		System.out.println("Run getAfterMethod3 method");    
	}
}


