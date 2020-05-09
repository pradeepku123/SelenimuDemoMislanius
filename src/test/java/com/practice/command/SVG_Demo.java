package com.practice.command;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVG_Demo {
	WebDriver driver;
	@BeforeMethod
 	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/"); // First get() Browser Command Executed
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@AfterTest
	public void tearDown() {
		// driver.quit();
	}
	@Test
	public void svgELementTest() {
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.cssSelector(".LM6RPg")).sendKeys("Need Essential");
		driver.findElement(By.xpath("")).click();	
	}

}
