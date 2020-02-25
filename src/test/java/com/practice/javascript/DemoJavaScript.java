package com.practice.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoJavaScript {
       WebDriver driver;
   	@BeforeMethod
	public void setUp() {
   		//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"true");
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@Test
	public void testStart() throws InterruptedException {
	   // WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='field2']")));
	    //  Thread.sleep(2000);
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    //jse.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').setAttribute('value','ravi.kiran1@gmail.com')");
	    //jse.executeScript("document.getElementById('field2').setAttribute('value','Pradeep')");
	   // jse.executeScript("window.scrollTo(0,1000)");
	    jse.executeScript("arguments[0].style.border='4px solid red';",driver.findElement(By.id("Wikipedia1_wikipedia-search-input")));
	    Thread.sleep(2000);
	    jse.executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[contains(.,'Click Me')]")));
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    
	    jse.executeScript("alert('pradeep');");
	    
	    System.out.println();
		
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(1200);
		driver.quit();
		
	}
}
