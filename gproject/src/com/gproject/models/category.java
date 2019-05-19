package com.gproject.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class category{
	
	public String getcategories() {
		
		String categoryGrid = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
		con = DBConnection.createConnection();
		st = con.createStatement();
		rs = st.executeQuery("select * from categories");
		
		if(rs.first()) {
			categoryGrid="<table border='1' cellspacing='1' cellpadding='1'><tr><th>No</th><th>Name</th><th>Description</th><th>Edit</th><th>Delete</th></tr>";
			rs.beforeFirst(); 
			while(rs.next())  {   
				categoryGrid = categoryGrid + "<tr><td>" + rs.getString(1) + "</td>"  + "<td>" + rs.getString(2) + "</td>"  + "<td>" + rs.getString(3) + "</td>"  + "<td><input id=\"btnEdit\" type=\"button\" name=\"btnEdit\"  param=\"" + rs.getString(1) + "\" value=\"Edit\"</td>"  + "<td>" + "<input id=\"btnRemove\" type=\"button\" name=\"btnRemove\" param=\"" + rs.getString(1) + "\" value=\"Remove\"</td></tr>";
			} 
		}else {  
			categoryGrid= "There are no items...";
			categoryGrid = categoryGrid + "</table></br>";
		}
		} catch (SQLException e) { 
			e.printStackTrace();
			}     
		return categoryGrid;  
	}
	
	public String saveAcategory(String categoryName, String categoryDesc) { 
		
		String res = null;
		String sql = null;
		Connection con = null;
		Statement st = null;
		
		try {
			con = DBConnection.createConnection(); //establishing connection
			st = con.createStatement(); //Statement is used to write queries. Read more about it.
			sql = "insert into items (nameitems, descitems) values ('" + categoryName + "', '" + categoryDesc + "')"; 
			st.executeUpdate(sql);
			res = "Successfully inserted...";
		}   catch (SQLException e) {
			e.printStackTrace(); 
			}
		return res;
	}
}
