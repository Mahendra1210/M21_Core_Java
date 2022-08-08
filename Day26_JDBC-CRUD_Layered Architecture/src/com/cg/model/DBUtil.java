package com.cg.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://Localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Patel@1210";
		try
		{
			//to check whether the eclipse is connected with mysql or not
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword); 
			if(c!=null)
			{
				System.out.println("Connection Establised");
				c.close();   //whenever we open or established a connection we always have to close the connection
			}		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
	    }
		

	}

}
