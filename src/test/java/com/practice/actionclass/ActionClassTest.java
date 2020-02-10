package com.practice.actionclass;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		WebElement Source=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement Dest=driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement DestOne=driver.findElement(By.xpath("//div[@id='box101']"));
		action.dragAndDrop(Source, Dest).perform();
		Thread.sleep(2000);
		action.dragAndDrop(Dest, DestOne).perform();
		action.contextClick(Dest).perform();
		
		
			
		
		/*
		 
		 * action.moveToElement(login).click().build().perform();
		 * driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		   Actions action =new Actions(driver);
			WebElement Source=driver.findElement(By.xpath("//div[@id='box2']"));
			WebElement Dest=driver.findElement(By.xpath("//div[@id='box104']"));
			action.dragAndDrop(Source, Dest).perform();;
			Thread.sleep(2000);
		
		 * WebElement login=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		   action.clickAndHold(login).perform();
		   Thread.sleep(5000);
		   action.release().perform();
		 
		 * WebElement login=driver.findElement(By.xpath("//div[@id='post-body-6103478144908648662']//a[1]"));
		   action.dragAndDropBy(login, 100,0).perform();
		   Thread.sleep(3000);
		   action.dragAndDropBy(login, -100,0).perform();
		
		*/
		
		Thread.sleep(5000);		
		
		
		
		
		driver.quit();
	}
	

}
