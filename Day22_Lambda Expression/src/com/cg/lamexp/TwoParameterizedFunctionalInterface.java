package com.cg.lamexp;

interface P
{
	//two parameterized abstract method
	String print(String s,String t);
}
public class TwoParameterizedFunctionalInterface {

	public static void main(String[] args) {
		
		P obj=(String s,String t)->
		{
			return s+t;
		};
		System.out.println(obj.print("Max"," " +"Holden"));
	}

}
