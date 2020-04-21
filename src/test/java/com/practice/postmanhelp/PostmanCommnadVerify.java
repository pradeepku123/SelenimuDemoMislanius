package com.practice.postmanhelp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PostmanCommnadVerify {
	@Test
	public void test() {
	  System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"./test-output/myBrowserlog.txt");
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://testautomationpractice.blogspot.com/");
	  WebElement Element = driver.findElement(By.xpath("//*[@id='field2']"));
	  Element.click();
	  System.out.println();
	  
	}

}
