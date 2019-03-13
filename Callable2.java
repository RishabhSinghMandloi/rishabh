package com.callable.org;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;



public class Callable2 {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    	Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			System.out.println("Connection is created");
			
			
			 CallableStatement cst = con.prepareCall("call delete1(?)");
		    
			  cst.setInt(1, 3);
			    
			   cst.setString(2, "new posts title");
			    
			   cst.registerOutParameter(2, Types.VARCHAR);
			    
			 int res = cst.executeUpdate();
			   System.out.println("Number of rows deleted "+res);
			    
			   String title = cst.getString(2);
			    
	 }
}	 
