package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee 
{

	public static void main(String[] args) 
	{
		
		String dbURL="jdbc:mysql://Localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Patel@1210";
		
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			//to delete rows
			String query="DELETE FROM EMPLOYEES WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1,101);
			int r=p.executeUpdate();   
			if(r>0)
			{
				System.out.println("Existing user is deleted successfully");
			}
			c.close();   			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
