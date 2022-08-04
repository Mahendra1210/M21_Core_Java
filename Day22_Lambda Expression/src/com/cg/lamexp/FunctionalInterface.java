package com.cg.lamexp;
//functional Interface
interface A
{
	//Zero-parameter abstract method
	void show();
}

/*class B implements A
{
	public void show()
	{
		System.out.println("Program to implement functional interface using lambda expression");
	}
}*/
public class FunctionalInterface {

	public static void main(String[] args) {
		//B b=new B();
		//b.show();
		//Lambda Expression
		A obj=()->
			{
			System.out.println("Program to implement functional interface using lambda expression");
			};
			obj.show();
		}
	

}
