package com.cg.interfacekeyword;

public interface InterfaceExample {
//	by default its abstract method
	void display();

}
class X implements InterfaceExample
{
//	provided the implementation for abstract method inside the Demo class
	@Override
	public void display()
	{
		
		System.out.println("InterfaceExample");
	}	
	
}

