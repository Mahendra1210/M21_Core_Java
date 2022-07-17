package com.tns.recursion;
//Program to find  sum of digits
import java.util.Scanner;

public class Sumofdigits {
	static int sumofdigit(int n) {
		
		if(n==0) {
			return 0;
		}
		
		else {
			return(n % 10 + sumofdigit(n/10));
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		System.out.println("The sum of " +n +" is: " +sumofdigit(n));
		sc.close();

	}

}
