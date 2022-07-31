package com.tns.multithreading;

class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread passed");
	}
}

public class Main {

	public static void main(String[] args) {
		Test create=new Test();
		create.start();
		create.start(); // this line will give exception error as thread is already running and cannot be passed again

	}

}
