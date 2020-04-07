package com.practice.command;

import org.openqa.selenium.WebElement;

public class FrameHelper extends BrowserCommand{

	/**
	 * Swich To the Frame based On the Index Where Index Started With  0,1,2,3 ,4 Show On
	 * if index Not Found Then its Throws a NoSuchFrameException
	 * @param index
	 */
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * switch To The Frame Based On  The Frame Attribute ID And Name if Available and Swich To That Particluar Frame
	 * if Not Found To Specific Frame And Id The Raise NoSuchFrameException
	 * @param reciveNameOrID
	 */
	public void switchToFrame(String reciveNameOrID) {
		driver.switchTo().frame(reciveNameOrID);
	}
	/**
	 * Switch to The Frame Based On The Frame Webelement Previously Detected By Using driver.findElement();
	 *  Raises Exception As Per Situation  NoSuchFrameException Or staleElementReferanceException
	 * @param iframeElemet
	 */
	public void switchToFrame(WebElement iframeElemet) {
		driver.switchTo().frame(iframeElemet);
	}
	/**
	 * its Switch To The Priviously Focused Frame
	 */
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	/**
	 * its Return or Focused To Default Content defalut WebPage which Frame Is currently Available
	 */
	public void switchDefaulutWeb() {
		driver.switchTo().defaultContent();
	}
}
