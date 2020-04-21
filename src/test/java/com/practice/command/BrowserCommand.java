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
			CookiesUtilityClass.createurOwnCookies("at-acbin", "Atza|IwEBIDEjiIqN5nT4scmsZwv_KLA0Y-gGaE2NFir8uguRa7qiKxWfsyiP9NR3Fr5Lj9zpPPUMCStyW2j1OmtyMk58NWwVCcLmUtpaTVLGc9E_hZH_LQ5S0Reaoutb0ktoDQ2X5aKPy3Ikaiw8Zj0xMvCmT1lf5pd35WKze_7auRzc3BrRfkZVCymIkUFkHsTNw5aL4W_E0Dcpa_3v-WZ4noxuAo8kKmaZYgOrlQ45lcd2K-j7pXzwZd7magKGUfM2pqsspW4FUBjYePElWmNbrICiJv6sBJJzuIuLbTlOo5c2382gQVoUmTQY6xJLiV2F4DJq7t1XLc7l0VzMNum7TUlLKk4M79a3E-jGqktxIGVUyxV10O-XM4zcDcXZH55Rqlivmw96JIBQ2xKiI6fDTAHzMJvaJRzWRDEa7raQWFFoKagJxVWyPVC4O9TdBNPtORA0V5w", driver);
			CookiesUtilityClass.createurOwnCookies("i18n-prefs", "INR", driver);
			CookiesUtilityClass.createurOwnCookies("sess-at-acbin", "CEpD9kGTBtIFn3V+c5+iDTeg1BQtEQMin2E1v7sNDwg=", driver);
			CookiesUtilityClass.createurOwnCookies("session-id", "258-3827534-5017506", driver);
			CookiesUtilityClass.createurOwnCookies("session-id-time", "2082758401l", driver);
			CookiesUtilityClass.createurOwnCookies("session-token", "RTaDxd4WgdytskODLzOHJilNP2f67s7scOY5fZ30XPsAXr4bVZbQZ7B1UsL5OLXltcZ/JtfGeIXOgGHc6KwSDxXcp7P2iQYy5GgE9k4YRArEUr5unB6LyzcENbgtrES3XtWVwwBGH4NsM/VnVtRJB8beqaSQKopUDYm2D7hSMVArHEE86lHu4l2FPihgR6SpIUYLHpwpyKfVlocM6zr9jjhwBhVw3TMIhAWLv9DcPhVRZlmWI6nd2lJh5k/bFI3n+HL+3w0xw65Ca8blBMTFPQ==", driver);
			CookiesUtilityClass.createurOwnCookies("sst-acbin", "Sst1|PQEzPgZZstP6e1V7Iix69tBBC01Yp0wTWvWhIYcUKCVNbyxrIe-AsvwA_PNFvuHPjIOuMll02KBRuY0-uNMF2D8--JmgQVG-SpbT7YBc8EjCzGLq1XHUTr3PpLbB1mG8AztDfyz2Ip-FiydejYZftT-njaNunbVa64D2B5w7_qx3yTgZBCGhsnotNHHSq5tmta7tL_gyhJwgoRn2u0lYu8E1JgVhQdWEMIPkTAsAaobnDJ16YsC25D5zcwPv7F8njpzS1b-tketD6CU_heqCfK1vh8J9w4Zxfsn_asLp-GISnMLzAIFL1oDSqc6Rd9Ka9qnDVoiOv8cAB9qtl6K5DBlRuA", driver);
			CookiesUtilityClass.createurOwnCookies("ubid-acbin", "258-4579426-1192953", driver);
			CookiesUtilityClass.createurOwnCookies("visitCount", "2", driver);
			CookiesUtilityClass.createurOwnCookies("x-acbin", "rqadCKwHM@2JqY?Zd8q@xqk?CXsfMsxpXf2FVl0qlW1QQ58nqqRGcrOhfWoRbmcO", driver);
			CookiesUtilityClass.createurOwnCookies("x-wl-uid", "1hOu0/W4SBbyDlsdB2BKwNJ1qdbLsO1TVqIt97NUSZ/4jZc/7C9Hh0VRPLHvW2nol8xgz1MwFtb0QbjMIXszJl/TUiTUNx4jAGUMnS0DvU85COCtEFktq27fRekhI19c2FGX+fwL1APE=", driver);
			CookiesUtilityClass.createurOwnCookies("cdn-session", "AK-2577ec1bee1cde8d9132366f7486e964", driver);
			CookiesUtilityClass.createurOwnCookies("csm-hit", "tb:s-32CWKP5K9YCFE7AAJE8F|1586694227422&t:1586694227945&adb:adblk_yes", driver);
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
