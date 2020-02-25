package com.practtice.collectwebelemrt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		 System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://omayo.blogspot.com/");
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}
	@Test
	public void test() {
		
		List<WebElement> temp = driver.findElements(By.xpath("//div[@class='widget LinkList']//ul"));
		for(WebElement x:temp) {
			
			 System.out.println(x.getText());
			
		}
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
