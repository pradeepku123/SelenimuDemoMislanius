package com.practice.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandle {
	WebDriver driver=null;
	@BeforeMethod
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/page6.html");
		driver.manage().window().maximize();
	}
	@Test
	public void MainExection() throws ParseException {
		 driver.switchTo().frame("dateFrame");
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		 String Date="19/05/1993";
		 SimpleDateFormat sdate=new SimpleDateFormat("dd/MM/yy"); //Transfer to format 
		 Date DateConvertion=sdate.parse(Date); //create the Date object using factory method & parse 
		 System.out.println(DateConvertion);
		 String sDD=new SimpleDateFormat("dd").format(DateConvertion); //using format get the exact value of date
		 System.out.println(sDD);
		 String sMon=new SimpleDateFormat("MMMM").format(DateConvertion);//using format get the exact value of Month if u use "MM" then its give index of month
		 System.out.println(sMon);
		 String sYear=new SimpleDateFormat("yyyy").format(DateConvertion);//using format get the exact value of year
		 System.out.println(sYear);
		 //hello 2nd time
		 
	}
	@AfterMethod
	public void TearDown() {
		//driver.quit();
	}

}
