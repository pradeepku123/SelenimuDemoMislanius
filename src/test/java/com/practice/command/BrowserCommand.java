package com.practice.command;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommand {
		WebDriver driver;
		@BeforeMethod
	 	public void SetUp() {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.get("https://stqatools.com/demo/Alerts.php"); // First get() Browser Command Executed
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
		}
		@Test
		public void handleAlert() throws InterruptedException {
			AlertHelper altAlertHelper=new AlertHelper();
			WebElement alertclick=driver.findElement(By.xpath("//button[@id='btnAlert']"));
			alertclick.click();
			Thread.sleep(300);
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			//driver.switchTo().alert().accept();
			//altAlertHelper.alertHelperStadStillAccept();
		}
		@Test(enabled = false)
		public void findBorkenLink() {
			int x=0;
			List<WebElement> webElementByTag_a = driver.findElements(By.xpath("//a"));
			for(WebElement tagWebElement:webElementByTag_a) {
				System.out.println(tagWebElement.getAttribute("href") +"::"+ x);
				x++;
			}
		}
		@Test(enabled = false)
		public void browserCommand() throws InterruptedException{
			String webPageTittle = driver.getTitle(); // Get The Current Title of A Web Browser
			System.out.println("Title Of The WebPage has::"+ webPageTittle);
			String WebgetText = driver.findElement(By.xpath("//button[contains(.,'Click Me')]")).getText(); //Get The text Of Particular Tag
			System.out.println("GetText Of a WebElement::"+WebgetText);
			String webURL = driver.getCurrentUrl();
			System.out.println("Current Url Of current WebPage::"+webURL);// Web
			String WebPageSource=driver.getPageSource();
			System.out.println("{PrageSouce::"+WebPageSource);
			driver.manage().window().setPosition(new Point(0,-1000));
			
			System.out.println("Navigate Command");
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(5000);
		}
		@Test(enabled = false)
		public void selectClassTest() throws InterruptedException {
			WebElement selectDate  = driver.findElement(By.cssSelector("#day"));
			WebElement selectMonth = driver.findElement(By.cssSelector("#month"));
			WebElement selectYear  = driver.findElement(By.cssSelector("#year"));
			SelectHelper selectHelper=new SelectHelper();
			selectDate.click();
			/*selectHelper.getAllOptions(selectDate);
			selectHelper.printAllOptionSelectBox();
			*/
			selectHelper.selectSelectHelper(selectDate,12);
			
		}
		@AfterMethod
		public  void tearDown() throws InterruptedException {
		    Thread.sleep(5000);
			driver.close();
		}
}
