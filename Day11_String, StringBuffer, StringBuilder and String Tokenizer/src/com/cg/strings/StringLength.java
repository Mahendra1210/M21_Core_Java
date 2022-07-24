package com.cg.strings;
//Program to find string length
import java.util.Scanner;

public class StringLength 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(str.length());
		
//		To find a character at a particular index number
		String str1="Mahendra";
		System.out.println(str1.charAt(2));
		sc.close();
		

	}

}
