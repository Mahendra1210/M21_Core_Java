package com.cg.thiskeyword;
//To invoke current class constructor 'this' keyword is used

public class CurrentClassConstructor {
	
	String str;
	CurrentClassConstructor()
	{
		this("Jos buttler");
		System.out.println("Inside default constructor \n");
	}
	
	CurrentClassConstructor(String str)
	{
		this.str=str;
		System.out.println("Inside parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		CurrentClassConstructor c=new CurrentClassConstructor();
		

	}

}
