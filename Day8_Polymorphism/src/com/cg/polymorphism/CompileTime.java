package com.cg.polymorphism;
//Program on different parameters

class A
{
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
}

public class CompileTime {

	public static void main(String[] args) {
		A obj=new A();
		obj.add(5, 25);
		obj.add(3.9f, 4.5f);

	}

}
