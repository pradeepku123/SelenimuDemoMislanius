package com.practice.webelementtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Key;

public class UtilityElement {
	public static WebDriver driver=null;
	
	public static void waitElementClickable(WebDriver driver,WebElement webelement) {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
		List<WebElement> book = driver.findElements(By.cssSelector("#hello"));
	}
		public static void waitElementVisible(WebDriver driver,WebElement webelement) {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(webelement));
	}
	
	public static void webElementClick(WebDriver driver,WebElement webElement) {
		waitElementVisible(driver, webElement);
		webElement.click();	
	}
	public static void webElementsendKey(WebElement webElement,String sendData) {
		//waitElementVisible(driver, webElement);
		//webElement.clear();
		
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		driver.switchTo().frame(iframe);
		
		
		
		webElement.sendKeys(sendData);
		
	}
	public static void webElemetTab(WebDriver driver,WebElement webElement) {
		Actions action=new Actions(driver); 
		action.sendKeys(webElement, Key.TAB).perform();
		
	}

}
