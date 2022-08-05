package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[]{-1,45,12,4,13,18});
		Optional<Integer>obj2=obj1.stream().filter((i)->i>5).reduce((a,b)->a>b?a:b);
		if(obj2.isPresent())
		{
			System.out.println("Result:" +obj2.get());
		}
	}

}
