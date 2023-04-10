package com.embroyo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQuery {
 public static void main(String[] args) {
	
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");
		Statement stm= con.createStatement();
	stm.executeUpdate("create table teacher (id number primary key , name varchar(200) ,age number)");
		System.out.println("create table successfully........");
		stm.executeUpdate("insert into teacher(id,name,age) values(2,'sumon',20) ");
		System.out.println("insert table sucessfully...");
		stm.close();
		con.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
