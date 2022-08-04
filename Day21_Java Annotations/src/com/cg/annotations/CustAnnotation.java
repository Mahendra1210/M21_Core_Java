package com.cg.annotations;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface Owncustom
{
	int accept();
}
class C
{
	@Owncustom(accept=40)
	public void display()
	{
		System.out.println("I am using Custom Annotations");
	}
}



public class CustAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		C c=new C();
		Method m=c.getClass().getMethod("display");
		Owncustom obj=m.getAnnotation(Owncustom.class);
		c.display();
		System.out.println(obj.accept());
		
	}

}
