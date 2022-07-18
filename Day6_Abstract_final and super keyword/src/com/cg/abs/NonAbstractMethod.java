package com.cg.abs;

abstract class A
{
	void print() {
		System.out.println("Non-abstract method");
	}
}
 
class B extends A
{
//	As B is inheriting the properties of A class then it has print method
	}
public class NonAbstractMethod {

	public static void main(String[] args) {
		A a=new B();
		a.print();

	}

}
