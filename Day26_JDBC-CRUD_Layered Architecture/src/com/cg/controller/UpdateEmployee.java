package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee 
{

	public static void main(String[] args) 
	{
		
		String dbURL="jdbc:mysql://Localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Patel@1210";
		
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			String query="UPDATE EMPLOYEES SET Salary=? WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			p.setFloat(1, 45000f);
			p.setInt(2, 101);
			int r=p.executeUpdate();   
			if(r>0)
			{
				System.out.println("A new user is updated successfully");
			}
			c.close();   			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	}

}


