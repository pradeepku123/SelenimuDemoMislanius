package com.practice.command;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Key;
import org.testng.Assert;
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
			driver.get("https://www.amazon.in/"); // First get() Browser Command Executed
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
		}
		@Test
		public void testCookies() {

			CookiesUtilityClass.deleteAllcookies(driver);
			CookiesUtilityClass.createurOwnCookies("i18n-prefs", "INR", driver);
			CookiesUtilityClass.createurOwnCookies("session-id", "260-9614880-5780307", driver);
			CookiesUtilityClass.createurOwnCookies("session-id-time", "2082758401l", driver);
			CookiesUtilityClass.createurOwnCookies("session-token", "uZQ2ghq8taCiET+Fd3sKPu5r2DsLcqeQO0YtpPdM8XW923if1MFyipVADg0fkeRMqw2xEDkDUQMH8XJUXWx8uI4LYVWye+RCqVv3MCoMMuOW8WmBKY+OJ7eoQKpNqx+jfQl96LtqNS4BtBgobd/Uef/Z7Mvq9mrzudzyBhTMuyOQ5GRhUP1kvFVaXBGp0GHZ", driver);
			CookiesUtilityClass.createurOwnCookies("ubid-acbin", "260-1577206-5667617", driver);
			CookiesUtilityClass.createurOwnCookies("visitCount", "3", driver);
			CookiesUtilityClass.createurOwnCookies("x-wl-uid", "1byfjFEfUuEhNGb2BHoP9Cj4AJEnkgZeLSLXSfFNMsqKRJKUlrzBQTCQbaGy/0PnP9EkhwcYPrnw=", driver);
			CookiesUtilityClass.createurOwnCookies("cdn-session", "AK-765bf62ed949f87f787a346ccb8811bb", driver);
			CookiesUtilityClass.createurOwnCookies("csm-hit", "tb:s-0SF7E6JHMBYTSV3ZGVMW|1586625927715&t:1586625928279&adb:adblk_yes", driver);
			CookiesUtilityClass.getAllXookies(driver);
			driver.navigate().refresh();
			CookiesUtilityClass.getCookiesDetails();
		}
		@Test (enabled = false)
		public void actionHelper() throws InterruptedException {
			
			
			//ActionHelper action =new ActionHelper();
			Actions actions=new Actions(driver);
			WebElement webElementGet = driver.findElement(By.cssSelector("#field2"));
			//actions.click(webElementGet).perform();
			actions.moveToElement(webElementGet).click().keyDown(webElementGet,Key.SHIFT).sendKeys(webElementGet,"pradeep").keyUp(webElementGet,Key.SHIFT).doubleClick(webElementGet).contextClick().build();
			
			/* action.moveToTheElements(actions,driver);
			System.out.println("---Offset Now ---");
			action.moveToElementByOffSet(actions,driver);
			System.out.println("Close");
			*/
		}
		@Test(enabled = false)
		public void getEmailIdOfHr() {
		   
		   List<WebElement> emailWebElement = driver.findElements(By.cssSelector(".red-text"));
		   for(WebElement reciveEmailAddress:emailWebElement) {
			   System.out.println(reciveEmailAddress.getText());
			   
		   }
		}
		@Test(enabled = false)
		public void javaScriptExecuteDemo() throws InterruptedException {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
		 
		     JavaScriptHelper javaScriptHelper=new JavaScriptHelper();
		     javaScriptHelper.NavigarteURL(jse);//Passed
//		     javaScriptHelper.AlertPopUp(jse, "HEllo Joyti");
//		     Thread.sleep(1000);
//		     driver.switchTo().alert().accept();
//		     javaScriptHelper.getInnerText(jse); //Not Working
		}
		@Test(enabled =false)
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
		    Thread.sleep(15000);
			//driver.close();
		}
}
