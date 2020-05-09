package com.practice.command;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	  public static WebDriverWait wait;
	  public static Wait<WebDriver> fluentWait;
	
	public static FluentWait<WebDriver> fluentWitSetup(WebDriver driver) {
		 return new FluentWait<WebDriver>(driver)
				     .withTimeout(40, TimeUnit.SECONDS)
				        .pollingEvery(5, TimeUnit.SECONDS)
				        .ignoring(NoSuchElementException.class);
	}
	public static By getTheLocator(String locatorType,String locator) {
		if(locatorType.equals("id")) {
			return By.id(locator);
		}
		else if(locatorType.equals("name")) {
			return By.name(locator);
		}else if(locatorType.equals("className")) {
			return By.className(locator);
		}else if(locatorType.equals("css")) {
			return By.cssSelector(locator);
		}else if(locatorType.equals("xpath")) {
			return By.xpath(locator);
		}else if(locatorType.equals("linkTest")) {
			return By.linkText(locator);
		}else if(locatorType.equals("partialLinkText")) {
			return By.partialLinkText(locator);
		}
		return null;
		
	}
	public static void titleisFluent(WebDriver driver,String title) {
    	fluentWait=fluentWitSetup(driver);
    	fluentWait.until(ExpectedConditions.titleIs(title));
	}
	public static void titleis(WebDriver driver,String title) {
	    	wait=new WebDriverWait(driver,30);
	    	wait.until(ExpectedConditions.titleIs(title));
		}
	public static void titleContains(WebDriver driver,String title) {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains(title));	
	}
	public static void urlToBo(WebDriver driver,String url) {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.urlToBe(url));
	}
	public static void urlContains(WebDriver driver,String url) {
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.urlContains(url));
	}
	public static void urlMathes(WebDriver driver,String url) {
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.urlContains(url));
	}
	public static void presenceOfElement(WebDriver driver,String locatorType,String Locator) {
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(getTheLocator(locatorType, Locator)));
	}
	

}
