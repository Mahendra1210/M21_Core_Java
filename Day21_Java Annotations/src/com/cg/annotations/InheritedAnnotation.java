package com.cg.annotations;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface CustomA
{
	//abstract method
	//Multi-value annotation
	String print();
	
}
class D
{
	@CustomA(print="Max")
	public void display()
	{
		System.out.print("Displaying inherited");
	}
}

public class InheritedAnnotation {


	public static void main(String[] args) {
		
		System.out.println("Hii everyone");
	}

}
