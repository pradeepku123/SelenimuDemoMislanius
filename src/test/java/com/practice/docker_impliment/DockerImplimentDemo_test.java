package com.practice.docker_impliment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.Version;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DockerImplimentDemo_test {
	RemoteWebDriver driver;
	DesiredCapabilities dc;
	@BeforeMethod
 	public void SetUp() throws MalformedURLException {
		//WebDriverManager.chromedriver().setup();
	
		dc=DesiredCapabilities.chrome();
		//dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
	
	    ChromeOptions option=new ChromeOptions();
	    option.merge(dc);
		URL url=new URL("http://192.168.56.1/wd/hub");
		driver=new RemoteWebDriver(url,option);
		driver.get("https://www.google.in/"); // First get() Browser Command Executed
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		}
	@Test
	public void dockerTestDemoOne() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Demo One"+currentUrl);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
