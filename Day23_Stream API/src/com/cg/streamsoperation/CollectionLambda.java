package com.cg.streamsoperation;

import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(12);
		System.out.println(obj);
		
		/*for (Integer i:obj)
		{
			System.out.println(i);
		}*/
		
		//1.using stream operation
		//obj.forEach(i->System.out.println(i));
		
		//2.without using lambda expression
		obj.forEach(System.out::println);
	}

}
