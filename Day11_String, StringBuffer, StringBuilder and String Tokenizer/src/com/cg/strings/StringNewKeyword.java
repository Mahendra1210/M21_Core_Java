package com.cg.strings;

import java.util.Scanner;

public class StringNewKeyword 
{

	public static void main(String[] args) 
	{
//		by using new keyword
		String str=new String("Hello world");
		System.out.println(str);
		
//		for taking user input
		Scanner sc=new Scanner(System.in);
		String str1=new String(sc.nextLine());
		System.out.println(str1);
		sc.close();
	}

}
