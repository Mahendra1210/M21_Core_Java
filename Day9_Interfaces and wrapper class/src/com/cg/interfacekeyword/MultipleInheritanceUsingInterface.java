package com.cg.interfacekeyword;
//Multiple Inheritance
interface Mother
{
	void display();
}
interface Father
{
	void print();
}
class son implements Mother,Father
{

	@Override
	public void print() {
		System.out.println("My Father name is Omprakash");
		
	}

	@Override
	public void display() {
		
		System.out.println("My Mother name is champa");
	}
	
}

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		son s=new son();
		s.display();
		s.print();

	}

}
