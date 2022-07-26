package com.cg.exception;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
//		if any exception will be there in a try block
//		that exception will be handled by catch block
		
		try
		{
		int z=15/x;
			System.out.println(z);
//			finally block will not execute if below statement is used
//			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Whether any exception occur or not , the finally block is always executed");
		}
		sc.close();
	}

}
