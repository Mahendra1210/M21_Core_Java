package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployee 
{

	public static void main(String[] args) 
	{
		
		//String dbDriver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://Localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Patel@1210";
			try
			{
				Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
				String query="INSERT INTO EMPLOYEES(ID,NAME, Salary) VALUES(?,?,?)";
				PreparedStatement p=c.prepareStatement(query);
				p.setInt(1, 101);
				p.setString(2, "Max");
				p.setInt(3, 85000);
				int r=p.executeUpdate();   //r is for row  // executes sql statements
					if(r>0)
					{
						System.out.println("A new user is inserted successfully");
					}
					c.close();   //to close the connection			
			}
			catch(SQLException e)
				{
				e.printStackTrace();
				}	

	}

}
