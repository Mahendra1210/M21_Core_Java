package com.cg.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class MapExample2 
{

	public static void main(String[] args) 
{
		SortedMap<String, String> obj = new TreeMap<String,String>();

				obj.put("Batsman: ", "Rohit");
				obj.put("Wicket Keeper: ", "Sanju");
				obj.put("Bowler: ", "Trent");
				obj.put("All-rounder: ", "Hardik");
				obj.put("Bowler: ", "Yuzi");

				for(@SuppressWarnings("rawtypes") SortedMap.Entry m:obj.entrySet())

				{

				System.out.println(m.getKey()+" "+m.getValue());

				}
				
}
	

}
