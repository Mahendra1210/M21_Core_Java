package com.cg.finalkeyword;

class C
{
//	we can't override and final method
//	final void accept
	 void accept()
	{
		System.out.println("I am providing restrictions");
	}
	}
class D extends C
{
	void accept()
	{
		System.out.println("Restriction provided");
	}

}


public class FinalMethod {

	public static void main(String[] args) {
		D d=new D();
		d.accept();

	}

}
