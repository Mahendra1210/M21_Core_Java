package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudInsert {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://Localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Patel@1210";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			String query="INSERT INTO EMPLOYEES (ID,NAME,EMAIL_ID,PASSWORD)VALUES(?,?,?,?)";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1, 234);
			p.setString(2, "Neha");
			p.setString(3, "Neha@gmail.com");
			p.setString(4, "Neha@123");
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
