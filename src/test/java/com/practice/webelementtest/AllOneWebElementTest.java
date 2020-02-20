package com.practice.webelementtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllOneWebElementTest extends UtilityElement {
	 @BeforeMethod
	 public void setUp() {
		    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://testautomationpractice.blogspot.com/");
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
	 }
	 @Test
	 public void selectWebElement() {
		 
		  LandingPage newpage=new LandingPage();
		 
		  newpage.justClickOperation();
		 
	 }
	 @AfterMethod
	 public void tearDown() throws InterruptedException {
		 Thread.sleep(9500);
		 driver.quit();
		 }
	
}
