package com.cg.abs;
//Program for abstract class

abstract class Fruit
{
//	abstract method
	abstract void display();
}

class Mango
{
//	provide implementation for abstract method
	void display() {
		System.out.println("Mango is Delicious");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
//		we can't create object for abstract class
//		Fruit f=new Fruit();
		Mango f=new Mango();
		f.display();
	}

}
