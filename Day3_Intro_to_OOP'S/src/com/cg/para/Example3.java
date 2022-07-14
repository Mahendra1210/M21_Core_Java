package com.cg.para;

import java.util.Scanner;

class C
{
	int rollno;
	String name;
	int rollno1;
	String name1;
	
	
	C(int r,String n)
	{
		rollno=r;
		name=n;
		rollno1=r;
		name1=n;
	}
	void print()
	{
		System.out.println("Roll no is:" +rollno+" and Name is: " +name);
	}
}



public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollno=sc.nextInt();
		String name=sc.nextLine();
		
		int rollno1=sc.nextInt();
		String name1=sc.nextLine();
		
		
		C obj=new C(rollno,name);
		C obj1=new C(rollno1,name1);
		obj.print();
		obj1.print();
		sc.close();
		

	}

}
