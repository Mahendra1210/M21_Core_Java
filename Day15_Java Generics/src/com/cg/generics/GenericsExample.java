package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<Integer>();
		obj.add(11);
		obj.add(12);
		//1/3.compile-time checking and type safe
		//obj.add("12");
		
		System.out.println(obj);
		
		//2.Type-casting is not required in Generics
		List<String>obj1=new LinkedList<String>();
		obj1.add("Mahendra");
		obj1.add("Patel");
		String str=obj1.get(1);
		//typecasting explicitly if there is not an object type
		//string str1=(string)obj1.get(1);
		System.out.println(str);
		
		
	}

}
