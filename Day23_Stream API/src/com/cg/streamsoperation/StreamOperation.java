package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(12,13,25,35,25,19);
		//distinct:it takes unique values
		//obj.stream().distinct().forEach(System.out::println);
		
		//it sets the limit-first n-limit elements
		obj.stream().limit(5).forEach(System.out::println);
		System.out.println();
		
		//it will sort the elements
		obj.stream().sorted().forEach(System.out::println);
	}

}
