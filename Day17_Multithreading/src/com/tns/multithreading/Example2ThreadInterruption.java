package com.tns.multithreading;
class Thread4 extends Thread
{
	public void run()
	{
		System.out.println("Thread interruption");
	}
}

public class Example2ThreadInterruption {

	public static void main(String[] args) {
		Thread4 t=new Thread4();
		t.start();
		System.out.println("is thread interrupted "+t.isInterrupted());  //will give boolean value whether it is interrupted or not
		
		//here thread will not interrupt because it is not in sleeping or in wait state
		t.interrupt();
		System.out.println("is thread interrupted "+t.isInterrupted());
		
		

	}

}
