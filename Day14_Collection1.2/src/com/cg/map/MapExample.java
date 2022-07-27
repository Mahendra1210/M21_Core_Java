package com.cg.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<Integer,String>();
		//1.HashMap is unordered
		//2.LinkedHashMap is ordered
		obj.put(12, "Patel");
		obj.put(2, "Max");
		System.out.println(obj);


	}

}
