package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("Apple","Banana","Mango");
		System.out.println("Word length for object-fruits");
		obj.stream().map(String::length).forEach(System.out::println);
		
		
		List<Integer>obj1=Arrays.asList(1,45,12,13,18);
		obj1.stream().map(i->i*i).collect(Collectors.toList());
		List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(obj2+" ");
	}

}
