package com.embroyo.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertAndCreate {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","orcl");
			
			try {
				Statement stm1 = con.createStatement();
			stm1.executeUpdate("create table employee (id number primary key , name varchar(200), salary number)");
			 System.out.println(" table create sucessfully..");
			}catch(Exception e) {
				System.out.println(" already table created.. please insert your queary...");
			}
			PreparedStatement stm = con.prepareStatement("insert into employee (id,name,salary)values(?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				 System.out.print("enter employee id :");
				int no = Integer.parseInt(br.readLine());
				
				System.out.print("enter employee name :");
				String nam= br.readLine();
				
				System.out.print("enter employee salary :");
				double sal = Double.parseDouble(br.readLine());
				
				stm.setInt(1,no);
				stm.setString(2, nam);
				stm.setDouble(3, sal);
				 int count = stm.executeUpdate();
			if (count>0) {
				System.out.println(count+ "row insert.....");
			}
			else {
				System.out.println(" row can't inserted..");
			}
			System.out.println(" do you want more insert ...");
			String choice = br.readLine();
			if (choice.equalsIgnoreCase("yes"))

				break ;
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
