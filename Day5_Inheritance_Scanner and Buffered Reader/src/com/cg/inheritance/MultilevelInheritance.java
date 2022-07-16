package com.cg.inheritance;
//Program on Multilevel inheritance
class Car{
	void cartype(){
		
		System.out.println("Engine is on petrol");
	}
	
}
class Scorpio extends Car{
	public String brand="Mahindra Scorpio";
	void brand(){
		System.out.println("Brand is: "+brand);
	}
	
}
class S11 extends Scorpio{
	public int Speed=60;
	void average() {
		System.out.println("The speed is: "+Speed+" km/hr");
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Scorpio s1=new Scorpio();
		s1.brand();
		
		Car s=new Car();
		s.cartype();
		
		S11 s2=new S11();
		s2.average();
		
	}

}
