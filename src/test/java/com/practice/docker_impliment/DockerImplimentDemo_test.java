package com.practice.docker_impliment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DockerImplimentDemo_test {
	RemoteWebDriver driver;
	DesiredCapabilities dc;
	@BeforeMethod
 	public void SetUp() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		dc=DesiredCapabilities.firefox();
		URL url=new URL("http://192.168.99.100:4444/wd/hub");
		driver=new RemoteWebDriver(url,dc);
		driver.get("https://www.google.in/"); // First get() Browser Command Executed
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		}
	@Test
	public void dockerTestDemoOne() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Demo One"+currentUrl);
	}
	@Test
	public void dockerTestDemoTwo() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Demo Two"+currentUrl);
	}
	@Test
	public void dockerTestDemoThree() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Demo Three"+currentUrl);
	}
	@Test
	public void dockerTestDemoFour() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Demo Four"+currentUrl);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
