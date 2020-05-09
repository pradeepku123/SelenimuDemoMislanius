package com.practice.EventListnerWithLog4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.mysql.cj.log.Log;

public class LogForJDemo {
	public static Logger log=LogManager.getLogger(LogForJDemo.class);
	
	public static void main(String[] args) {
		System.out.print("Hello");
		PropertyConfigurator.configure("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\src\\test\\java\\com\\practice\\EventListnerWithLog4j\\log4j2.properties");
		log.info("hello");
		log.debug("Hello world");
		log.warn("yes its log");
		log.fatal("Yes");
	}

}
