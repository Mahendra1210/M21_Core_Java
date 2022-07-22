package com.cg.annoclass;
//Annonymous class
abstract class Annonymous
{
	public abstract void method();
}

public class Demo 
{

	public static void main(String[] args) 
	{
		Annonymous a=new Annonymous()
		{
		public void method()
			{
				System.out.println("This is an example of an Annonymous class");
			}

		};
		a.method();
	
	}

}


