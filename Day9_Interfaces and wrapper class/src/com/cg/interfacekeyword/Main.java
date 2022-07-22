package com.cg.interfacekeyword;

interface inf
{
//	by default its abstract method
	void display();

}

 class Demo implements inf
{
//	 provided the implementation for abstract method inside the Demo class
	public void display() 
	{
		System.out.println("Interface");
	}
}
public class Main
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.display();
	}
}