package com.practice.EventListnerWithLog4j;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.Configurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;

public class EventListner {
	public WebDriver driver;
	Logger log = Logger.getLogger(EventListner.class);;
	@BeforeMethod
	public void voidSetUp() {
		
		    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			EventFiringWebDriver eventFiringWebDriver=new EventFiringWebDriver(driver);
			eventFiringWebDriver.register(new WebDriverEventlistner());
			eventFiringWebDriver.get("http://testautomationpractice.blogspot.com/");
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/com/practice/EventListnerWithLog4j/log4j.properties");
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
