package com.cg.list;

import java.util.ArrayList;

public class CloneArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList();
		obj.add("Mahendra");
		obj.add(12);
		obj.add(13.05);
		System.out.println("ArrayList elements are: "+obj);
		Object clonelist;
		clonelist=obj.clone();
		System.out.println(clonelist);
		
	}

}
