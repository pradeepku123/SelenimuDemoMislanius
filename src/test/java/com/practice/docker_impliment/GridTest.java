package com.practice.docker_impliment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GridTest {
	DesiredCapabilities dc;
	WebDriver driver;
	 public static final String URLr = "http://192.168.56.1:4444/wd/hub";
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		dc=DesiredCapabilities.firefox();
		
		dc.setPlatform(Platform.WIN10);
		ChromeOptions option =new ChromeOptions();
		option.merge(dc);
		
		URL url=new URL(URLr); 
		driver=new RemoteWebDriver(url,dc);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void regularTest() {
		driver.get("http://www.google.com");
	}

}
