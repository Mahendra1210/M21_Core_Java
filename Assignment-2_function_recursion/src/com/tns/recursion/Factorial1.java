package com.tns.recursion;
//Program for factorial using recursion

import java.util.Scanner;

public class Factorial1 {
	static int factorial(int n) {
		
		if(n==1) { 
			return 1;
		}
			
		else {
			return n*factorial(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
		sc.close();


	}

}
