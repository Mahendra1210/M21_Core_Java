package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUpdate {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://Localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Patel@1210";
		
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			//to update rows
			String query="UPDATE EMPLOYEES SET NAME=?,EMAIL_ID=? WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			p.setString(1, "Parag");
			p.setString(2, "Parag@gmail.com");
			p.setInt(3, 121);
			//p.setString(4, "parag@123");
			int r=p.executeUpdate();
			//if row>0 means at least some rows are there
			if(r>0)
			{
				System.out.println("A new user is inserted successfully");
				
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
