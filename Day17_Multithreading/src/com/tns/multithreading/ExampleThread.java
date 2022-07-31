package com.tns.multithreading;

public class ExampleThread extends Thread 
{
	public void run()
	{
		System.out.println("Thread is going to run");
	}

	public static void main(String[] args) 
	{
		ExampleThread e=new ExampleThread();
		e.start();

	}

}
