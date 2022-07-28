package com.cg.generics;
//Generic class

public class GenericClass<T>{
	//T is data type
	T num;
	public void display()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		
		GenericClass<Integer>obj=new GenericClass<Integer>(); //generics advantage
		obj.num=15;
		obj.display();
	}

}
