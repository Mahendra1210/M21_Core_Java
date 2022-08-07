package com.cg.enum1;
//enum using switch case
enum Bike
{
	Pulser,KTM,R15,R3,Honda
}
public class Example3 {

	public static void main(String[] args) {
		
		Bike b=Bike.Honda;
		switch(b)
		{
		case Pulser:
			System.out.println("You chosen Pulser");
			break;
			
		case KTM:
			System.out.println("You chosen KTM");
			break;
			
		case R15:
			System.out.println("You chosen R15");
			break;
			
		case R3:
			System.out.println("You chosen R3");
			break;
			
		default:
			System.out.println("Invalid name");
		}
	}

}
