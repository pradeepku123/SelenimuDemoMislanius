package com.practice.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandle {
	WebDriver driver=null;
	// ChromeOptions chromeOptions=null;
	@BeforeMethod
	public void Setup() {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void MainExection() throws ParseException, InterruptedException {
		 String Date="15/12/2020";
		 SimpleDateFormat sdate=new SimpleDateFormat("dd/MM/yy"); //Transfer to format 
		 Date DateConvertion=sdate.parse(Date); //create the Date object using factory method & parse 
		 System.out.println(DateConvertion);
		 String sDD=new SimpleDateFormat("dd").format(DateConvertion); //using format get the exact value of date
		 int inSdate=Integer.parseInt(sDD);
		 String sMon=new SimpleDateFormat("MMMM").format(DateConvertion);//using format get the exact value of Month if u use "MM" then its give index of month
		 String sMonumber=new SimpleDateFormat("MM").format(DateConvertion);
		 int smonthint=Integer.parseInt(sMonumber);
		 String sYear=new SimpleDateFormat("yyyy").format(DateConvertion);//using format get the exact value of year
		 int inSyear=Integer.parseInt(sYear);
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		 String dispalyYear=driver.findElement(By.xpath("//span[.='2020']")).getText();
		 int indidpalyYear=Integer.parseInt(dispalyYear);
		 System.out.println(indidpalyYear);
		 System.out.println(inSyear);
		
		 if(indidpalyYear==inSyear) {
			 while(!(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()).equals(sMon)) {
				 System.out.println(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
	                              
	               		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	
			 }
		 }
		 else if(indidpalyYear>inSyear) {
			 while(indidpalyYear!=inSyear) {
				 Thread.sleep(100);
				 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				 if((driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()).equals(sMon)) {
					 indidpalyYear--; 
				 }
				 
			 }
			 
		 }else if(indidpalyYear<=inSyear) {
			 while(indidpalyYear!=inSyear) {
				 Thread.sleep(100);
				 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				 if((driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()).equals(sMon)) {
					 indidpalyYear++; 
				 }
			 }
			 
		 }
		 String date="//a[.='"+inSdate+"']";
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		 driver.findElement(By.xpath(date)).click();	
		 
		 
		 
		 
		 
		 /*
		   >> its click each & evey date for month fine passeds
		 for(int i=1;i<30;i++) {
			 String date="//a[.='"+i+"']";
			 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			 driver.findElement(By.xpath(date)).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//input[@id='datepicker']")).clear();
			 
			 
		 }
		 
		 */
		 
		
		 
	}
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
