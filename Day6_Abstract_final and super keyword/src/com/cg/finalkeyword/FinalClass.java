package com.cg.finalkeyword;
//we can't extend final class
//final class Vehicle
class Vehicle

{
	void display()
	{
		System.out.println("Vehicle Type");
	}
	}

class bike extends Vehicle
{
	void print() {
		System.out.println("Bike");
	}

public class FinalClass {

	public  void main(String[] args) {
		bike b=new bike();
		b.print();

	}

}
}
