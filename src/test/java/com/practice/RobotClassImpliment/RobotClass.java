package com.practice.RobotClassImpliment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Robot robot=new Robot();
		Actions action =new Actions(driver);
		WebElement find=driver.findElement(By.xpath("//div[@id='box2']"));
		action.moveToElement(find).contextClick().build().perform();
		

	}

}
