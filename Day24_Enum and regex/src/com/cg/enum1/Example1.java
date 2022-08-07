package com.cg.enum1;
//using enum outside classs
enum Car
{
	Mercedes,BMW,Audi;
}

public class Example1 {

	public static void main(String[] args) {
		
		//object cannot be created for enum class hence using below statement
		Car c=Car.BMW;
		System.out.print(c);
	}

}
