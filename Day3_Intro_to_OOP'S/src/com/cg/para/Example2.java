package com.cg.para;
import java.util.Scanner;
class B
{
	B(int a)
	{
		System.out.print("The value of a is: " +a);
	}
	}

public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		B obj=new B(a);
		sc.close();
	}

}
