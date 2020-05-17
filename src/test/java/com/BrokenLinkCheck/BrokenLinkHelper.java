package com.BrokenLinkCheck;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkHelper {
	
	public static void brokenLinkFinder() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		HttpURLConnection hub=null;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");// if Not Given The Absolute Address The Throws InvalidArrgumentException Type 
		driver.manage().window().maximize();
		List<WebElement> BrokenList = driver.findElements(By.tagName("a"));
		Iterator<WebElement> brokentIterator = BrokenList.iterator();
		while(brokentIterator.hasNext()) {
			WebElement webElement = brokentIterator.next();
			String brokenlinkhref=webElement.getAttribute("href");
			System.out.println("Link Address To be Tested :-"+brokenlinkhref);
			if(brokenlinkhref!=null) {
			try {
				
				hub=(HttpURLConnection) new URL(brokenlinkhref).openConnection();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				hub.setRequestMethod("HEAD");
			} catch (ProtocolException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				hub.connect();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println("Response Code"+hub.getResponseCode());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hub.disconnect();
		}
	}
		
	}
	public static void main(String[] args) {
		new BrokenLinkHelper().brokenLinkFinder();
	}

}
