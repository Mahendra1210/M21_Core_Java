package com.cg.instanceofoperator;
class A
{
	}

public class ChildInstance extends A {

	public static void main(String[] args) {
		
		ChildInstance c=new ChildInstance();
//		c is the object of parent class "A" because "ChildInstance" class accessing th "A" class
		System.out.println(c instanceof A);
	}

}