package com.capegemini.intro;
import java.util.Scanner;


public class Assignment1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter the value of a");
//	a is for number of trees in rows
	int a=sc.nextInt();   
	
	System.out.print("Enter the value of b");
//	b is for number of trees in columns 
	int b=sc.nextInt();
	
	
	System.out.print("Enter the value of c");
//	c is for number of trees
	int c=sc.nextInt();

	if(a+b==c ||(a+b)*2==c){
	System.out.println("It is a mango tree");
		
	}
	else {
		System.out.println("It is not a mango tree");
	}
		

	}

}
