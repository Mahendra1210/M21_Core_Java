package com.cg.statickeyword;
//static keyword in terms of variable
public class StaticVariable {
	static int a=25;
	public static void main(String[] args) {
//		Here value of a is reinitialized
		a=12;
		System.out.println(a);

	}

}
