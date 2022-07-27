package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		Set<Object>obj=new LinkedHashSet<Object>();
		obj.add("Mahendra");
		obj.add(12);
		obj.add(1.58f);
		System.out.println(obj);
		//to extract the elements of a set separately
		Object[] arr=obj.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
