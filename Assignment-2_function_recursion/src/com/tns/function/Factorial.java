package com.tns.function;
//Program for Factorial

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
		sc.close();

	}

}
