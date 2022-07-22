package com.cg.interfacekeyword;
interface Vehicle
{ 
//	abstract method
	void speed();
}
//When we use two interface and we are going to access one interface from another interface
//then always use extends keyword
interface Car extends Vehicle
{
	void engine();
}
class Bus implements Car
{
	public void engine() 
	{
		System.out.println("Petrol");
	}

	@Override
	public void speed() {
	System.out.println("Speed is 40km/hr");
	}
}
public class MainExample {

	public static void main(String[] args) {
		Bus b=new Bus();
		b.engine();
		b.speed();
	}

}
