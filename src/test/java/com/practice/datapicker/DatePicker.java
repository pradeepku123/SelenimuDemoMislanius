package com.practice.datapicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePicker {
    private WebDriver driver; 
    
    private By currentDateOfYear = By.cssSelector("[class='ui-datepicker-year']");
    private By previousMonth = By.cssSelector("[class='ui-icon ui-icon-circle-triangle-w']");
    private By AfterMonth = By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']");
    private By monthOfDatePicer=By.cssSelector("[class='ui-datepicker-month']");
	
    public DatePicker(WebDriver driver) {
         this.driver=driver;
	}
	
    public void SelectTheDate(int dd,int mm,int yyyy) {
		selectYearFromDatePicker(yyyy);
		selectMonthFromDatePicker(mm);
		selectDayFromDatePicker(dd);
		
	}
	
    private void selectDayFromDatePicker(int dd) {
    	String DateOfDataPicker="//a[text()='"+dd+"']";
    	driver.findElement(By.xpath(DateOfDataPicker)).click();
		
	}

	private void selectMonthFromDatePicker(int mm) {
    	 int currentMM=currentMmOfDatePicker();
    	while (currentMM>mm) {
    		 driver.findElement(previousMonth).click();
    		 currentMM=currentMmOfDatePicker();
		}
    	while (currentMM<mm) {
   		 driver.findElement(AfterMonth).click();
   		 currentMM=currentMmOfDatePicker();
		}
    	
		
	}
    
	private void selectYearFromDatePicker(int yyyy) {
		
	 int currentYYYY=Integer.parseInt(currentYearOfDatePicker());
	 while(currentYYYY!=yyyy) {
		 if(currentYYYY>yyyy) {
			 driver.findElement(previousMonth).click();
			 currentYYYY=Integer.parseInt(currentYearOfDatePicker());	 
		 }
		 else if(currentYYYY<yyyy) {
			 driver.findElement(AfterMonth).click();
			 currentYYYY=Integer.parseInt(currentYearOfDatePicker());
		 }
	 }
	 
    }
	
	private int currentMmOfDatePicker() {
		
		return getcorrespondingYear(driver.findElement(monthOfDatePicer).getText());	
	}
    
    private String currentYearOfDatePicker() {
    	
    	return driver.findElement(currentDateOfYear).getText();
    }
    private int getcorrespondingYear(String currentMonth) {
        if(currentMonth.equalsIgnoreCase("December")) {
        	return 12;
        }
        else if(currentMonth.equalsIgnoreCase("November")) {
        	return 11;
        }
        else if(currentMonth.equalsIgnoreCase("October")) {
        	return 10;
        }
        else if(currentMonth.equalsIgnoreCase("September")) {
        	return 9;
        }
        else if(currentMonth.equalsIgnoreCase("August")) {
        	return 8;
        }
        else if(currentMonth.equalsIgnoreCase("July")) {
        	return 7;
        }
        else if(currentMonth.equalsIgnoreCase("June")) {
        	return 6;
        }
        else if(currentMonth.equalsIgnoreCase("May")) {
        	return 5;
        }
        else if(currentMonth.equalsIgnoreCase("April ")) {
        	return 4;
        }
        else if(currentMonth.equalsIgnoreCase("March")) {
        	return 3;
        }
        else if(currentMonth.equalsIgnoreCase("February")) {
        	return 2;
        }
        else if(currentMonth.equalsIgnoreCase("January")) {
        	return 1;
        }
		return 0;
    }

}
