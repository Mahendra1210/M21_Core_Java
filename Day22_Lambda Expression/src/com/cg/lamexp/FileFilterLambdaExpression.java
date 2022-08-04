package com.cg.lamexp;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambdaExpression {

	public static void main(String[] args) {
		FileFilter obj=(File pathname)->pathname.getName().endsWith(".txt");
		File dir=new File("C:\\Users\\Mahendra patel\\Downloads");
		File[] contents=dir.listFiles(obj);
		 
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}
