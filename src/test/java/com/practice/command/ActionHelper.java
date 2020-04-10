package com.practice.command;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHelper extends BrowserCommand {
	public void moveToTheElements(Actions actions ,WebDriver driver) throws InterruptedException {
		WebElement webElementGet = driver.findElement(By.cssSelector(".wikipedia-search-button"));
		actions.moveToElement(webElementGet).perform();
		Point x = webElementGet.getLocation();
		int xaxis=x.getX();
		int yaxis=x.getY();
		System.out.println(xaxis+"----"+yaxis);
		Thread.sleep(1000);
		
		
	}
	public void moveToElementByOffSet(Actions actions,WebDriver driver) throws InterruptedException {
		WebElement webElementGet = driver.findElement(By.cssSelector(".wikipedia-search-button"));
		Point x = webElementGet.getLocation();
		int xaxis=x.getX();
		int yaxis=x.getY();
		actions.moveByOffset(x.getX(),x.getX()).perform();;
		
		System.out.println(xaxis+"----"+yaxis);
		Thread.sleep(1000);
		
		
	}

}
