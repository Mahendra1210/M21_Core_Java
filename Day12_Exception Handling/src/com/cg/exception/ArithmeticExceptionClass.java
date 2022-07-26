package com.cg.exception;

import java.util.Scanner;

public class ArithmeticExceptionClass 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
//		if any exception will be there in a try block
//		that exception will be handled by catch block
		
		try
		{
		int z=15/x;
			System.out.println(z);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		sc.close();
	}

}
