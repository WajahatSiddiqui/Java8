package com.wajahat.learn.java8.unit1;

public class RunnableExample {
	public static void main(String args[]) {
		Thread mythread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("In runnable");
			}
		});
		
		mythread.start();
		
		Thread mythreadLambda = new Thread(()->System.out.println("In runnable lambda"));
		mythreadLambda.start();
	}
}
