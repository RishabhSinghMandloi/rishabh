package com.callable.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.sql.CallableStatement;


public class CallProcedure1 {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    	Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			System.out.println("Connection is created");
			
			
		CallableStatement cst = con.prepareCall("call updatetitle(?,?)");
        cst.setInt(1, 2);
		    
	    cst.setString(2, "new posts title");
	    
		    
     int res = cst.executeUpdate();
	    
     String title = cst.getString(2);	    		    
      System.out.println(title);		    

  }
}