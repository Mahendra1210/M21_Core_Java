package com.cg.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		Map<Character,String> obj=new LinkedHashMap<Character,String>();
		obj.put('S', "Sanju");
		obj.put('J', "Jos");
		obj.put('Y', "Yuzi");
		obj.put('T', "Trent");
		System.out.println(obj);
		
		obj.remove('J');
		//to archieve single-single elements separately
		for(@SuppressWarnings("rawtypes") Map.Entry m:obj.entrySet())
		{
			
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
