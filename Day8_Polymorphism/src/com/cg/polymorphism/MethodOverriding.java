package com.cg.polymorphism;
//Program on method overriding
//one class is not enough, create two or more class which contains inheritance concept

class Multiplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
	
}

class Mult extends Multiplication
{
	void accept(int x,int y)
	{
		System.out.println(x*y);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Mult m=new Mult();
		m.accept(4, 5);
		Multiplication m1=new Multiplication();
		m1.accept(9, 9);
	}
	

}
