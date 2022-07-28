package com.cg.generics;

public class GenericMethod 
{

	public static void main(String[] args) 
	{
		
		Integer arr[]= {11,22,33};
		Character ch[]= {'M','A','H'};
		
		System.out.println("Integer Array: ");
		print(arr);
		
		System.out.println("Character Array: ");
		print(ch);
		
	}	
		
		//Generic Method: we can pass any type of Arguments
		//E is a element
		public static <E>void print(E[] elements)
		{
			for(E elem:elements)
			{
				System.out.println(elem);
			}
			System.out.println();
		}
}
	


