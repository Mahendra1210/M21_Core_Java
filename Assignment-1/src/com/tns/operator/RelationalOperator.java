package com.tns.operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
				int b=sc.nextInt();
					boolean res=a>b;
//					similarly we can use <,>,<=,>=,!=,== operators in relational operators
						System.out.println(res);
							sc.close();
			

	}

}
