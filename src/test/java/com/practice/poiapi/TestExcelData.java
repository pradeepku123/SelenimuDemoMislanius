package com.practice.poiapi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestExcelData {
	
	@DataProvider
	public Object[][] getData() {
		Object[][] obj=null;
		MyXLSReader xls=new MyXLSReader("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\resouces\\TestData.xlsx");
		obj = DataUtil.MyTestData(xls,"LoginCredential","hello");
		return obj;
	}
	
	@Test(dataProvider = "getData")
	public void Test(HashMap<String, String> map) {
		 FileInputStream fis=null;
		 XSSFWorkbook workbook=null;
	     map.get("USERID");
	     map.get("PASSWORD");
	     
	     File testFile=new File("C:\\Users\\PRADEEP\\eclipse-workspace\\PracticeSelenium\\resouces\\TestData.xlsx");
	     try {
			fis=new FileInputStream(testFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	     try {
			 workbook=new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    
		System.out.println(workbook.getSheet("LoginCredential").getRow(2).getCell(2).getStringCellValue());//.getRow(0).getCell(0).getStringCellValue()
	     
	     
		
	 }
	

}
