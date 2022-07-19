package com.cg.thiskeyword;
//To return current class instance 'this' keyword is used
class Substract
{ 
	int a,b;
	
//	Default constructor
	Substract()
	{ 
		 a=30;b=25;
	
	}

//	Method to return current class instance
	Substract get()
	{ 
		return this;
	
	}
	
	 void display()
	{
		System.out.println("The Substraction of a and b is:"+(a-b));
	
	}

}
public class CurrentClassInstance {

	public static void main(String[] args) {
		
		Substract s=new Substract();
		s.get().display();

	}

}
