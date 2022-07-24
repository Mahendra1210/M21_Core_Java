package com.cg.strings;
//StringBuffer: to create mutable strings


public class StringBufferExample 
{

	public static void main(String[] args) 
	{
//		StringBuffer s=new StringBuffer(""); 
//		System.out.println(s.capacity()); here as null string is passed so capacity will be 16 by default

		String s="Today";
		StringBuffer sb=new StringBuffer(s.length());
		System.out.println(sb.capacity());
		
	}

}
