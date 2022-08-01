package com.cg.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect 
{

	public static void main(String[] args) 
	{
		String dbDriver="com.mysql.cj.jdbc.Driver";
		
		String dbURL="jdbc:mysql://Localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Patel@1210";
		String query="SELECT * FROM STUDENT";
		//if any exception will occur in driver class that will handle by using catch block
		//if class name of the driver is incorrect,then it will throw an exception
		try
		{
		Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
		e.printStackTrace();
		}
		try
		{
		Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		Statement s=c.createStatement()	;
		ResultSet r=s.executeQuery(query);
		
			while(r.next())
			{
			String data="";
			
			//column
				for(int i=1;i<=2;i++)
				{
				data=data+" "+r.getString(i);
				}
				System.out.println(data);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Invalid URL/ID/PASSWORD");
			e.printStackTrace();
		}
	

	}

}
