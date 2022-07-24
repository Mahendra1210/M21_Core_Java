package com.cg.strings;
//Program on string matching

import java.util.Scanner;

public class Question1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="Dhoni";
		
		if(str.equals(str1))
		{
			System.out.println("String is equal");
		}
		else
		{
			System.out.println("String is not equal");
		}
		
		sc.close();
				
	}

}
