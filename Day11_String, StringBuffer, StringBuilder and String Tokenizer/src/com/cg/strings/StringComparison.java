package com.cg.strings;

public class StringComparison 
{

	public static void main(String[] args) 
	{
//		String str="Hello";
//		String str1="Hello";
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println(str1==str2); //false because both strings having different memory locations
		
		System.out.println(str1.equals(str2));
		
		
	}

}
