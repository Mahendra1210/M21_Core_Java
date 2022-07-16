package com.cg.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Program on BufferReader

public class BufferReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		String str=obj.readLine();
		System.out.println(str);
		

	}

}
