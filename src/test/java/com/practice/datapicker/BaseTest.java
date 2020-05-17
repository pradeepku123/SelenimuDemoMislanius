package com.practice.datapicker;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	/**
	 * Autor Pradeep Kumar Behera
	 */
    public WebDriver driver;
    
    private By datePicker=By.cssSelector("input[id='datepicker']");    
 
    @BeforeMethod
    public void setup() {
         WebDriverManager.chromedriver().setup();
         System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
         driver=new ChromeDriver();
         driver.get("http://testautomationpractice.blogspot.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
         driver.manage().timeouts().setScriptTimeout(15,TimeUnit.SECONDS);    
    }
    
    @Test
    public void selectGivenDate() {
    	System.out.println("Welcome To Test Automation");
    	driver.findElement(datePicker).click();
    	DatePicker dtp=new DatePicker(driver);
    	dtp.SelectTheDate(7,6,1988);
    	
    }
    
    @AfterMethod
    public void tearDown() throws InterruptedException {
    	Thread.sleep(10000);
    	driver.quit();
    	
    }
}
