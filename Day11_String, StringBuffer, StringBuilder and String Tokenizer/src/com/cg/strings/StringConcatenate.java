package com.cg.strings;
//Program on string concatenate

import java.util.Scanner;

public class StringConcatenate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		
//		by using + operator
//		System.out.println(10+20+"Hello"+"World"+10+20);
		
		
//		by using concat() keyword
		System.out.print(str.concat(str1));
		sc.close();
		
		
	}

}
