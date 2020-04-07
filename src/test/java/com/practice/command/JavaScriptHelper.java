package com.practice.command;

import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptHelper {
	
	public void AlertPopUp(JavascriptExecutor jse,String reciveMsg) {
		jse.executeScript("alert('"+reciveMsg+"');");
	}
	public void getInnerText(JavascriptExecutor jse) {
		String innerText=jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(innerText);
	}
	public void NavigarteURL(JavascriptExecutor jse) {
		jse.executeScript("window.location='https://www.google.com';");
		
	}
	public void navigateForward(JavascriptExecutor jse) {
		jse.executeScript("window.history.forwod();");
	}
	public void navigateBack(JavascriptExecutor jse) {
		jse.executeScript("window.history.forward();");
	}

}
