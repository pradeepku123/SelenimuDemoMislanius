package com.practice.poiapi;
import java.util.HashMap;
import java.util.Map;

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
		
	     map.get("USERID");
	     map.get("PASSWORD");
	     
		
	 }
	

}
