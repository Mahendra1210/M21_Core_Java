package com.cg.lamexp;

interface X
{
	int display(int a,int b);
}

public class ParameterizedFunctionWithoutReturnType {

	public static void main(String[] args) {
		
		X x=(int a,int b)->(a+b);
		System.out.println("The addition is: "+x.display(10, 20));
	}
		

}
