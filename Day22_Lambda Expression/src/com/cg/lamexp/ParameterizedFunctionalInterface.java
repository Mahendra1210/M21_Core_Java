package com.cg.lamexp;
//F
interface M
{
	//parameterized abstract method
	int print(int a);
}

public class ParameterizedFunctionalInterface {

	public static void main(String[] args) {
		M obj=(int a)->
		{
			return a;
		};
		System.out.println(obj.print(15));
		
		

	}

}
