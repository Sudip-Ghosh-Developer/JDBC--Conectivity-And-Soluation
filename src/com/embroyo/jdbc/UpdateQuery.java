package com.embroyo.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateQuery {
	public static void main(String[] args) {
		 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");
		PreparedStatement stm = con.prepareStatement(" '?',?");
 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));		       
	
 String s_dept =br.readLine();
		int s_id = Integer.parseInt(br.readLine());
		stm.setNString(1, s_dept);
		stm.setInt(2,s_id);
		
		int count=stm.executeUpdate("update student set dept="+s_dept+"where id="+s_id);
		if(count>0) {
		System.out.println(" 1 row update");
		}
		else {
		System.out.println("no");
		 }
		
		 }
		 catch(Exception e) {
			System.out.println(e); 
		 }
	} 

}
