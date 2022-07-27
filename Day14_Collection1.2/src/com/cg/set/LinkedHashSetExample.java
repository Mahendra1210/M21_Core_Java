package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Object>obj=new LinkedHashSet<Object>();
		//1.Hashset/set is unordered and LinkedHashset is an ordered
		//2.Set does not allow duplicate elements but list allows duplicate elements
		obj.add("Patel");
		obj.add(15);
		obj.add(5);
		obj.add(65);
		obj.add(65);
		obj.add(null);
		System.out.println(obj);
		

	}

}
