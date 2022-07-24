package com.cg.strings;

import java.util.StringTokenizer;

//StringTokenizer: It is used to break string into tokens

public class StringTokenizerExample 
{

	public static void main(String[] args) 
	{
		
		/*StringTokenizer s=new StringTokenizer("Lets try this");
		System.out.println(s.nextToken()); //here the first token before delimiter is printed*/
		
		StringTokenizer s=new StringTokenizer("Lets try this");
		
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}
	}

}
