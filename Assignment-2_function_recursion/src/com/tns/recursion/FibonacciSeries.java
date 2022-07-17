package com.tns.recursion;
//Program to find nth term in fibonacci series using recursion 

import java.util.Scanner;

public class FibonacciSeries {
	static int fibonacci(int n) {
		
		if(n==0) { 
			return 0;
			}
		
		if(n==1) {
			return 1;
		}
		
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The Fibonacci series of "+n+" is: " +fibonacci(n));
		sc.close();
	}

}
