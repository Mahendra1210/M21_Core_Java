package com.cg.inheritance;
//Program on single inheritance
class Bike{
	public int speed=45;
	void speed() {
		System.out.println("The speed of Bike is: "+speed+"km/hr");
	}
	}

//Inheritance
class Honda extends Bike{
	public int speed=50;
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		Bike H=new Bike();
		H.speed();

	}

}
