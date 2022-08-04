package com.cg.annotations;
//@Override annotation is giving extra information about the method
class Car
{
	void speed(int s)
	{
		System.out.print("Speed is : "+s+"km/hr");
	}
}
class BMW extends Car
{
	@Override
	public void speed(int s)
	{
		System.out.println("Speed is : "+s+"km/hr");
	}
}
public class OverrideAnnotation {
	public static void main(String args[])
	{
		BMW b=new BMW();
		b.speed(60);
	}

}
