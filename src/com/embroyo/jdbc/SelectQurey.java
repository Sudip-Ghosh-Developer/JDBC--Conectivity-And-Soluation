package com.embroyo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQurey {
 
	 public static void main(String[] args) {
		    
		  try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from student");
			while(rs.next()) {  
			int a = rs.getInt(1);
			   String b = rs.getString(2);
			   String c= rs.getString(3);
			   int d= rs.getInt(4);
			   System.out.println(a);
			   System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(" ");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		  
		 
	}
}
