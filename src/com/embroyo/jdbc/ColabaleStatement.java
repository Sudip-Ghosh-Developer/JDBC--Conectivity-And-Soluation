package com.embroyo.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ColabaleStatement {
	public static void main(String[] args) {
		 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");
			
			CallableStatement call = con.prepareCall("{call employee_pro(?,?,?,?)}");
			call.setInt(1,22);
			call.setString(2, "tahir");
			call.setString(3, "bbc");
			call.setInt(4,25);
			call.execute();
			call.close();
			System.out.println("one raw update");
				
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}

}
