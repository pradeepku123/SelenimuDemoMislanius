package com.practice.webelementtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Key;

public interface UtilityElement {
	
	public static void waitElementClickable(WebDriver driver,WebElement webelement) {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
	}
		public static void waitElementVisible(WebDriver driver,WebElement webelement) {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(webelement));
	}
	
	public static void webElementClick(WebDriver driver,WebElement webElement) {
		waitElementVisible(driver, webElement);
		webElement.click();	
	}
	public static void webElementsendKey(WebDriver driver,WebElement webElement,String sendData) {
		waitElementVisible(driver, webElement);
		webElement.clear();
		webElement.sendKeys(sendData);
		
	}
	public static void webElemetTab(WebDriver driver,WebElement webElement) {
		Actions action=new Actions(driver); 
		action.sendKeys(webElement, Key.TAB).perform();
		
	}

}
