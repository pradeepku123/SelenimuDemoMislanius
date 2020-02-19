package com.practice.databasetest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.testng.annotations.Test;

public class AcessDatabase {
	
	@Test
	public void Testwork() throws ClassNotFoundException, SQLException {
		String str="select * from student";
		Database dat=new Database();
		ResultSet rdata = dat.getData(str);
		HashMap<String ,String> map=null;
		int i=0;
		Object [][]Obj=new Object[5][1];
		while(rdata.next()) {
			map=new HashMap <String,String>();
			String key=rdata.getInt(1)+"";
			String value=rdata.getString(2);
			map.put(key, value);
			System.out.println(map.get(key));
			Obj[i][0]=map;
			i++;
			}
		
		
	}
}
