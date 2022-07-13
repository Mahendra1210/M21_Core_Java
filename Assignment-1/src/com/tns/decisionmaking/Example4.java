package com.tns.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Maxim");
			break;
			
		case 2:
			System.out.println("Donald");
			break;
			
		case 3:
			System.out.println("John");
			break;
			
		default:
			System.out.println("Invalid input");
			sc.close();
			
		}
		

	}

}
