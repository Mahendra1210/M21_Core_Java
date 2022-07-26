package com.cg.exception;

import java.io.IOException;

//throws keyword is used to declare an exception

public class ThrowsKeyword {
	static void display(int x)throws IOException,ClassNotFoundException
	{
		if(x==5)
		{
			//throw keyword is used to throw an exception explicitly
			throw new IOException("Input-Output Exception");
		}
		else
		{
			throw new ClassNotFoundException("ClassNotFoundException");
		}
	}
	public static void main(String[] args) 
	{
		try 
		{
			display(10);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		

	}

}
