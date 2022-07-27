package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		//Set<Integer>obj=new HashSet<Integer>();
//		1.Set is an unordered
		Set<Object>obj=new HashSet<Object>();
		obj.add("Patel");
		obj.add(15);
		obj.add(5);
		obj.add(65);
		System.out.println(obj);
		

	}

}
