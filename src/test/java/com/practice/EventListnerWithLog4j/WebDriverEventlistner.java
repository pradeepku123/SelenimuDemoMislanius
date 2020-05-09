package com.practice.EventListnerWithLog4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.mysql.cj.log.Log;

public class WebDriverEventlistner implements WebDriverEventListener {
	Logger log = LogManager.getLogger(WebDriverEventlistner.class);
	@Override
	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("Before Alert Accepted");
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		System.out.println("Afrer Alert accepted");		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("After Alert Dissmissed");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("Before Alert dismiss");
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
	
		System.out.println("Before Navigate To");
		log.info("Hello");
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		 System.out.println("Afer Navivigable");
		 log.info("Yes it after");
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Navigable");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Navigable");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Befor Navigable");
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("After Navigable");
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Before Navigable");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("After Naviable");
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before FindnFindBy");
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("After find By");
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
	     System.out.println("BEfore Clik On");
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After Click On");
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Before value Change On");
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("After value On");
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		System.out.println("Before Script");
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		System.out.println("After Script");
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Before Switch to");
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("After Switch To Window");
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("OnException");
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
	    System.out.println("Before Screen Shot");
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		System.out.println("After Screen Shot");
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("After GetTexrt");
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("AfterGetTest");
		
	}

}
