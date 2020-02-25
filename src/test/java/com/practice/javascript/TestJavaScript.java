package com.practice.javascript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJavaScript {
	 WebDriver driver;
   //  WebDriverWait wait=new WebDriverWait(driver,30);
	@BeforeMethod
	public void Setup() {
		System.out.println("Program Start Now");
	}
	@Test
	public void perforrm() {
		System.out.println("Helooo This is Test");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("End Of Program");
	}

}
