package com.practice.command;

import org.openqa.selenium.Alert;

public class AlertHelper extends BrowserCommand {
	/**
	 * Three Method Support Alert 1-accept 2:-dissmiss 3:-getText
	 */
	public void alertHelperStadStillAccept() {
		driver.switchTo().alert().accept();;
	}
	public void alertHelperStadStillDismiss() {
		driver.switchTo().alert().dismiss();;
	}
	public String alertHelperStadStillGetText() {
		String getAlertTest = driver.switchTo().alert().getText();
		return getAlertTest;
	}
	public void alertHelperStadStillSendText(String rString) {
		driver.switchTo().alert().sendKeys(rString);
	}
	

}
