package com.cg.list;
//LinkedList: it internally uses doubly linked list to store elements
import java.util.LinkedList;

public class LinkedListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList();
		obj.add("Jofra");
		obj.add("Archer");
		obj.offer(45);
		System.out.println(obj);
		
		
		System.out.println(obj.contains(45));
		System.out.println(obj.remove(1));
		System.out.println(obj);
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		

	}

}
