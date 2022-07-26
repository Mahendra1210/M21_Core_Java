package com.cg.customexception;

import java.util.Scanner;

//checked Exception
//create an own exception
@SuppressWarnings("serial")
class NameNotFound extends Exception
{
	//constructor
	NameNotFound(String name)
	{
		super(name);
	}
	
}
public class CustomException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		try 
		{
			empname(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();
	}
//		declaring an exception
		static void empname(String str)throws NameNotFound
		{
			if(str.isEmpty())
			{
				throw new NameNotFound("Employee Name is empty");
			}
			else
			{
				System.out.println("Hello "+str+"");
			}
			
		}
		

	}


