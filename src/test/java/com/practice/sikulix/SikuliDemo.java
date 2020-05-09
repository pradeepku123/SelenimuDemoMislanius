package com.practice.sikulix;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliDemo {
	public static void main(String[] args) throws FindFailed, AWTException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		Screen screen =new Screen();
		Pattern userId=new Pattern("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\Resources\\userid.png");
		Pattern password=new Pattern("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\Resources\\password.png");
		Pattern login=new Pattern("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\Resources\\login.png");
		//screen.wait(userId,2);
		screen.type(userId,"mngr243120");
		screen.type(password,"udAhydy");
		
		Actions action=new Actions(driver);
		action.sendKeys(Key.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		/*Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		*/
		Thread.sleep(5000);
		
		/*screen.click(login);
		TakeRobotScreenCapture.TakeARobotScreenCapture();
		Thread.sleep(2000);
		TakeRobotScreenCapture.ScreenwithDefault(driver);*/
		driver.quit();
	}

}
