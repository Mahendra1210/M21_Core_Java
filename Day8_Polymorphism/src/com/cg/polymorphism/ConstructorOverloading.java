package com.cg.polymorphism;
//Program on constructor overloading
class Triber
{
	int speed;
	String engine;
//	Zero parameter
	Triber()
	{
		System.out.println("Renault-Triber");
	}
	
	
//	Two parameter
	Triber(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is: "+speed +"km/hr  and engine is on: "+engine);
	}

}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Triber t=new Triber();
		Triber t1=new Triber(45,"Petrol");
	}

}
