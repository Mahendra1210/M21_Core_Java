package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudDB {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://Localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Patel@1210";
		try
		{
			//to check whether the eclipse is connected with MYSQL or not
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			if(c!=null)
			{
			System.out.println("Connection is Established");
			//once the connection started we need to close it
			c.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
