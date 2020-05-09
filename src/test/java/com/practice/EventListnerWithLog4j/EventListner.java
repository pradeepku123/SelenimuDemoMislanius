package com.practice.EventListnerWithLog4j;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;

public class EventListner {
	public WebDriver driver;
	Logger log = LogManager.getLogger(EventListner.class);
	
	@BeforeMethod
	public void voidSetUp() {
		    PropertyConfigurator.configure("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\src\\test\\java\\com\\practice\\EventListnerWithLog4j\\log4j2.properties");
		    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			EventFiringWebDriver eventFiringWebDriver=new EventFiringWebDriver(driver);
			eventFiringWebDriver.register(new WebDriverEventlistner());
			eventFiringWebDriver.get("http://testautomationpractice.blogspot.com/");
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
			log.info("hello");
			log.info("Logging start");
	}
	@Test
	public void TestProcess() {
		System.out.println("Hiiiiiii");
		log.info("Logging start");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("Browser Close");
	}

}
