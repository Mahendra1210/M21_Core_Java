package com.cg.statickeyword;

public class StaticBlock {
	static int num;
	static String str;
//	Static block: if u want to initialise the value without using constructor then use static block and make 
//	the variable of the class as static 
	static
	{
		num=25;
		str="Mahendra";
	}
//	constructor
	/*StaticBlock()
	{
		num=25;
		str="Mahendra";
	}*/
	public static void main(String[] args) {
//		StaticBlock s=new StaticBlock();
//		System.out.println(s.num);
//		System.out.println(s.str);
		
		System.out.println(num);
		System.out.println(str);
	}

}
