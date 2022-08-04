package com.cg.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

//custom annotation
@interface Custom
{
	//abstract method
	//Multi-value annotation
	String print();
	int speed();
	float percentage();
	
}
class B
{
	@Custom(print="Hello world",speed=45,percentage=78.5F)
	public void display()
	{
		System.out.println("XYZ");
	}
}


public class CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		B b=new B();
		b.display();
		Method m=b.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		
		System.out.println(obj.print());
		System.out.println(obj.speed());

	}

}
