package com.cg.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
//		Arraydeque will print the element of a queue in same insertion
		
		Queue<Object> q=new ArrayDeque<Object>();
		q.offer(11);
		q.offer(12);
		q.offer(13);
		System.out.println(q);
		System.out.println(q.peek());
		
		
//		Priority queue will print the elements using priority of the elements
		Queue<Object> q1=new PriorityQueue<Object>();
		q1.offer(11);
		q1.offer(7);
		q1.add(10);
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.remove());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
		
	}

}
