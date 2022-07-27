package com.cg.list;
//ArrayList: it internally uses dynamic array to store elememts
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//declare the arraylist from collection class
		//List<Integer> obj=new ArrayList<>();
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList();
		obj.add("Mahendra");
		obj.add(12);
		obj.add(13.05);
		System.out.println("ArrayList elements are: "+obj);
		//size of the array
		System.out.println(obj.size());
		System.out.println(obj.contains(15));
		System.out.println(obj.indexOf(12));
		System.out.println(obj.lastIndexOf("Mahendra"));
	}

}
