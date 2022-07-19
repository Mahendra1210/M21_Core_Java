package com.cg.superkeyword;

//Super keyword - It is used to invoke parent class constructor
class Flower
{
	Flower()
	{
		System.out.println("Flower");
	}
	}
class Rose extends Flower
{
	Rose()
	{
//		we are invoking parent class constructor
//		First preference is given to constructor call and then print statement
		super();
		System.out.println("Rose is Red");
		
	}
	}
public class SuperConstructor {

	public static void main(String[] args) {
		Rose r=new Rose();
		

	}

}
