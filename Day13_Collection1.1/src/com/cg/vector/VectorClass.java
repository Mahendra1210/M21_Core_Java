package com.cg.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector v=new Vector();
		v.add(12);
		v.add("Jos");
		v.add(35.56f);
		System.out.println(v);
		
//		copying all elements of vector into arraylist using addALl mthod
		ArrayList<Object> a=new ArrayList<Object>();
		a.addAll(v);
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}

}
