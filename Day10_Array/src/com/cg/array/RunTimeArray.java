package com.cg.array;

import java.util.Scanner;

public class RunTimeArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		
//		to enter elements in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter" + i+"value");
			arr[i]=sc.nextInt();
			
		}
		
//		to print the array that we gave as a input
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
