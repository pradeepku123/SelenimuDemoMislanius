package com.practice.webelementtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends UtilityElement{
	public LandingPage() {
		 PageFactory.initElements(driver,this);
	}
       	    @FindBy(xpath="//input[@name='RESULT_TextField-1']")
			WebElement Fname;
       	    @FindBy(xpath="//input[@name='RESULT_TextField-2']")
			WebElement Lname;
       	    @FindBy(xpath="//input[@name='RESULT_TextField-3']")
       	    WebElement PhonNum;
       	    @FindBy(xpath="//input[@name='RESULT_TextField-4']")
       	    WebElement contry;
       	    @FindBy(xpath="//input[@name='RESULT_TextField-5']")
       	    WebElement city;
       	    @FindBy(xpath="//input[@name='RESULT_TextField-6']")
       	    WebElement email;
       	    @FindBy(xpath="")
       	    WebElement gmale;
       	    @FindBy(xpath="")
       	    WebElement gfemale;
       	    @FindBy(xpath="")
       	    WebElement weSun;
       	    @FindBy(xpath="")
       	    WebElement weMon;
       	    @FindBy(xpath="")
       	    WebElement weTue;
       	    @FindBy(xpath="")
       	    WebElement weWed;
       	    @FindBy(xpath="")
       	    WebElement weThr;
       	    @FindBy(xpath="")
       	    WebElement wefri;
       	    @FindBy(xpath="")
			WebElement weSat;
       	    @FindBy(xpath="//input[@id='field2']")
			WebElement Temp;
       	    
       	    public void justClickOperation() {
       	    	UtilityElement.webElementsendKey(Fname, "pradeep");
       	    }
}
