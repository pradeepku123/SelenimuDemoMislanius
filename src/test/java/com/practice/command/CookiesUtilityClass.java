package com.practice.command;

import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import com.mysql.cj.jdbc.Driver;

public class CookiesUtilityClass {
	static Set<Cookie> cookiesSet;
	public static void getAllXookies(WebDriver driver) {
		cookiesSet = driver.manage().getCookies();
		
	}
	public static void deleteAllcookies(WebDriver driver) {
		driver.manage().deleteAllCookies();	
	}
	public static void getCookiesDetails() {
		for(Cookie recive:cookiesSet) {
			System.out.println(recive.getName());
			System.out.println(recive.getValue());
			System.out.println(recive.getDomain());
			System.out.println(recive.getPath());
			System.out.println(recive.getExpiry());
		
		}
	}
	public static void createurOwnCookies(String name,String value,WebDriver driver) {
		Cookie cookie=new Cookie(name, value);
		driver.manage().addCookie(cookie);
		
	
	}

}
