package com.gproject.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection createConnection() {
		
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306";
		String username="root";
		String password="mango@7";
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con = DriverManager.getConnection("","","");
			System.out.println("Printing connection object"+con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}