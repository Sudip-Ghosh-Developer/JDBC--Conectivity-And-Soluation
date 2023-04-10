package com.embroyo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnections {

	public static void main(String[] args) {
		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");
				Statement stm = con.createStatement();
				stm.executeUpdate("create table teacher (id number primary key , name varchar(100),city varchar(200))");
				System.out.println("table successfully create by sudip");
				stm.close();
				con.close();
 
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		
		
		
		
	}

}
