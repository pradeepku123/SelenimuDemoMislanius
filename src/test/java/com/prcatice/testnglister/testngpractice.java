package com.prcatice.testnglister;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngpractice {
	WebDriver driver;
	@BeforeMethod()
		public void setUp() {
		System.out.println("Browser Start");
		   
	 }
	@Test(groups= {"Smoke","Regression"})
    public void methodTest2() {
		System.out.println("Test Method 2");
		
	}
    @Test(groups= {"Smoke","Regression"})
    public void methodTest3() {
    	System.out.println("Test Method 3");
		
	}
    @Test(groups= {"Smoke"})
    public void method5() {
    	System.out.println("Test Method 5");
		
	}
    @Test(groups= {"Regression"})
    public void method6() {
    	System.out.println("Test Method 6");
		
	}
    @Test(groups= {"Regression"})
    public void method7() {
    	System.out.println("Test M<ethod 7");
		
	}
    @AfterMethod
    public void tearDown() {
    	
		System.out.println("TearDown");
   	}

}
