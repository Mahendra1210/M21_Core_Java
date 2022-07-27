package com.cg.list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		Scanner token=new Scanner(str);
		token.useDelimiter(" ");
//		user input ArrayList
		
		ArrayList<Object> arr=new ArrayList<Object>();
//		to return the elements of the array
		while(token.hasNext())
		{
			arr.add(token.next());
			System.out.println(arr.get(arr.size()-1));
		}
		System.out.println(arr);


	}

}
