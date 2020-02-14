package com.practice.poiapi;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

public class DataUtil {
  public static Object[][] MyTestData(MyXLSReader xls,String Sheetname,String TestName) {
	   int coldatacnt=1;
       while(!(xls.getCellData(Sheetname,coldatacnt, 1 ).toString()=="")) {
    	   coldatacnt++;
       }
       int rowdatacnt=1;
       while(!(xls.getCellData(Sheetname,1, rowdatacnt ).toString()=="")) {
    	   rowdatacnt++;
       }
	  Object[][] obj=new Object[rowdatacnt-2][1];
	  HashMap<String, String> map=null;
	  for(int i=2;i<rowdatacnt;i++) {
		  map=new HashMap<String, String>();
		  for(int j=1;j<coldatacnt;j++) {
			  	 String key=xls.getCellData(Sheetname, j, 1);
				 String val= xls.getCellData(Sheetname,j,i);  
				 map.put(key,val);
			  }
		  obj[i-2][0]=map;
		  
	  }
	  return obj;
  }
}
