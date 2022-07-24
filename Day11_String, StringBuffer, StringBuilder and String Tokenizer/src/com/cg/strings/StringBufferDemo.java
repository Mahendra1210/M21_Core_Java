package com.cg.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buff=new StringBuffer("Internet of things");
		System.out.println(buff.capacity());  //here capacity will be 16(default)+18(string passed) =34
		
		buff= new StringBuffer(" ");
		System.out.println(buff.capacity()); //capacity is 17(16+1)

	}

}
