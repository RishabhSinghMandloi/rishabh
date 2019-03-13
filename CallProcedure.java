package com.callable.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.sql.CallableStatement;

public class CallProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection is created");

		
		
//	 //   CallableStatement cst = con.prepareCall("call updatetitle(?,?)");
//	    
//	    cst.setInt(1, 2);
//	    
//	    cst.setString(2, "new posts title");
//	    
//	    cst.registerOutParameter(2, Types.VARCHAR);
//	    
//	    int res = cst.executeUpdate();
//	    
//	    String title = cst.getString(2);
//	    
//	    System.out.println(title);
//	    
	    
  //CallableStatement cst = con.prepareCall("call delete1(?)");
	    
	 //   cst.setInt(1, 3);
	    
	  //  cst.setString(2, "new posts title");
	    
	 //   cst.registerOutParameter(2, Types.VARCHAR);
	    
	 //   int res = cst.executeUpdate();
	//    System.out.println("Number of rows deleted "+res);
	    
	   // String title = cst.getString(2);
	    
	    
	    CallableStatement cst1 = con.prepareCall("call insertTitle(?,?)");
	   
	    cst1.setString(1, "Pune");
		    
	    cst1.setString(2, "Body bopd");
	    cst1.registerOutParameter(1, Types.VARCHAR);

	    cst1.registerOutParameter(2, Types.VARCHAR);
	    
	    int res1 = cst1.executeUpdate();
	    
	    String title = cst1.getString(1);
	    String body=cst1.getString(2);
	    System.out.println(title);
	    System.out.println("Body:"+body);
	    
	    
	    
	}
}
