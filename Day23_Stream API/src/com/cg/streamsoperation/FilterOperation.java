package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class FilterOperation {

	public static void main(String[] args) {
		List<Float>obj=Arrays.asList(12.5f,55.2f,61.5f);
		//System.out.println(obj);
		//filtering with conditions:filter(predicate)
		obj.stream().filter(i->i>15.9f).forEach(System.out::println);

	}

}
