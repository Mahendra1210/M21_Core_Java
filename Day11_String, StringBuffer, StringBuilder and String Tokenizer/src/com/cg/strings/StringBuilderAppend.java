package com.cg.strings;

public class StringBuilderAppend {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity()); //capacity will be 16
		sb.append("Hive");
		System.out.println(sb.capacity()); //here also capacity will be 16 because the string passed before has length 5 
										   //which is less than 16
		sb.append("Java is my favourite language");
		System.out.println(sb.capacity());  //here we have to use formula:(16*2)+2  where 16 is previous capacity
	}

}
