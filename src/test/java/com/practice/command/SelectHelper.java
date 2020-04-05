package com.practice.command;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
	public Select select;
	List<WebElement> option,SelectedOption;
	/**
	 * Select The SelctBox Using visible Text on Screen When Click
	 * @param selctWebElement
	 * @param selectValue
	 */
	public void selectSelectHelper(WebElement selctWebElement,String selectValue) {
	    select=new Select(selctWebElement);
		select.selectByVisibleText(selectValue);
	}
	/**
	 * this Method Can Select By selctBox In term Of Index
	 * @param selctWebElement
	 * @param selctIndex
	 */
	public void selectSelectHelper(WebElement selctWebElement,int selctIndex) {
		 select=new Select(selctWebElement);
		 select.selectByIndex(selctIndex);
	}
	/**
	 * This Method Can select Selct Box Using its Value
	 * @param selectValue
	 * @param selctWebElement
	 */
	public void selectSelectHelper(String selectValue,WebElement selctWebElement) {
		    select=new Select(selctWebElement);
			select.selectByValue(selectValue);
	}
	/**
	 * DeSelect Visible Text 
	 * @param selctWebElement
	 * @param DeSelectValue
	 */
	public void selectDeselectHelper(WebElement selctWebElement,String DeSelectValue) {
		 select=new Select(selctWebElement);
		 select.deselectByVisibleText(DeSelectValue);
	}
	/**
	 * This Can DeSelcet By Using index Value
	 * @param selctWebElement
	 * @param deSelectValue
	 */
    public void selectDeselectHelper(WebElement selctWebElement,int deSelectValue) {
    	 select=new Select(selctWebElement);
    	 select.deselectByIndex(deSelectValue);
	}
    /**
     * its DeSelctThe Value By Usning Value
     * @param DeSelectValue
     * @param selctWebElement
     */
    public void selectDeSelectHelper(String DeSelectValue,WebElement selctWebElement) {
    	 select=new Select(selctWebElement);
    	 select.deselectByValue(DeSelectValue);
    }
    /**
     * Deselct All The Selccted Item
     * @param selctWebElement
     */
    public void SelectDeSelectHelper(WebElement selctWebElement) {
    	select=new Select(selctWebElement);
    	select.deselectAll();
    }
    /** 
     * SelectAll Option Acvailable in DropDown option Or a MultiSelection BOX
     * @param selctWebElement
     */
    public void getAllOptions(WebElement selctWebElement) {
    	select=new Select(selctWebElement);
    	option = select.getOptions();
    }
    /**
     * Print All Select List Of WebElement
     */
    public void printAllOptionSelectBox() {
    	for(WebElement element: option) {
    		System.out.println("WebElement are::"+ element.getText());
    	}
    }
    /**
     * Return All Selected Item Stored in List Reeference Object
     */
    public void selectAllSelectedOptions() {
    	SelectedOption = select.getAllSelectedOptions();
    }
    /**
     * Selct Fist Element of Selcet Class
     * @return
     */
    public WebElement selectFirstSelectedOptions() {
    	WebElement WebElement = select.getFirstSelectedOption();
    	return WebElement;
    	
    }
    /**
     * return WrappedElement
     * @return
     */
    public WebElement selectWrapSelectedOptions() {
    	WebElement WebElement = select.getWrappedElement();
    	return WebElement;
    	
    }
    /** 
     * Check is Multiple Or Not
     * @param webElement
     * @return
     */
    public boolean selectisMultiple(WebElement webElement) {
    	select=new Select(webElement);
    	boolean GetMultipleTestResult = select.isMultiple();
        return GetMultipleTestResult;
    	
    }

}
