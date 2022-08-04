package com.cg.annotations;

import java.lang.reflect.Method;
import java.lang.annotation.*;
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

//custom annotation
@interface CustomB
{
	//abstract method
	//Multi-value annotation
	String print();
}
class E
{
	@CustomB(print = "SHIWANI")
	public void display()
	{
		System.out.println("Displaying Inherited");
	}
}
class F extends E
{
	public void display1()
	{
		System.out.println("Displaying inherited-11");
	}
}

public class CustomAnnotations1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		F obj=new F();
		obj.display();
		obj.display1();
		
		Method m=obj.getClass().getMethod("display");
		CustomB obj1=m.getAnnotation(CustomB.class);
		
		System.out.println(obj1.print());
		
		
	}

}
