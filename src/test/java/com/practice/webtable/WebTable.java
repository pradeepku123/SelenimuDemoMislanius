package com.practice.webtable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
		WebDriver driver=null;

		@BeforeMethod
		public void Setup() {
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
		}
		@Test
		public void MainExection() {
			 
			    List<WebElement> totalTableData = driver.findElements(By.xpath("//table[@name='BookTable']//td"));	
			    for(int i=0;i<totalTableData.size();i++) {
			    	// System.out.println(totalTableData.get(i).getText());
			    }
		}
			  
			  
			   
			
		@AfterMethod
		public void TearDown() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		}
		//helloooo
}
