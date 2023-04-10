package com.embroyo.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Practice1 {

	public static void main(String[] args) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");
			Statement stm = connect.createStatement();
			stm.executeUpdate("create table bike (id number primary key , name varchar(200))");
			System.out.println("table created...");
			stm.close();
			connect.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
