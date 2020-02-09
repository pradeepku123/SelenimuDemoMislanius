package com.practice.sikulix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliDemo {
	public static void main(String[] args) throws FindFailed {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		Screen screen =new Screen();
		Pattern userId=new Pattern("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\Resources\\userid.png");
		Pattern password=new Pattern("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\Resources\\password.png");
		Pattern login=new Pattern("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\Resources\\login.png");
		screen.wait(userId,2);
		screen.type(userId,"mngr243120");
		screen.type(password,"udAhydy");
		screen.click(login);
	}

}
