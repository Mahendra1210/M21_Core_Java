package com.cg.vector;

import java.util.Stack;

public class StackProgram {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack s=new Stack();
//		push method is used to add the elements into the stack
		s.push(11);
		s.push(12);
		s.push("Mahendra");
		System.out.println(s);
		
//		pop method is used to remove the elements into the stack
		s.pop();
		System.out.println(s);

	}

}
