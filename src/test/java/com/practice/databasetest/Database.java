package com.practice.databasetest;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;




public class Database {
	public Connection con;
	public Statement smt;
	public Statement getStatement() throws SQLException, ClassNotFoundException {
		String driver="com.mysql.cj.jdbc.Driver";
		String connection="jdbc:mysql://localhost:3306/college";
		String userName="root";
		String password="root";
		con=DriverManager.getConnection(connection,userName,password);
	    Class.forName(driver);
		smt=con.createStatement();
		return smt;
		
	}
	public void insertData(String Query) throws SQLException, ClassNotFoundException {
		getStatement().executeUpdate(Query);
		
	}
	public ResultSet getData(String Query) throws SQLException, ClassNotFoundException {
		
		  ResultSet data=getStatement().executeQuery(Query);
		  
		  return data;
		
	}

}
