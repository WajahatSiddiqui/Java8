package com.wajahat.learn.java8.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> printMessage());
		t1.start();
		
		// MethodReferenceExample1::printMessage === () -> printMessage()
		Thread t2 = new Thread(MethodReferenceExample1::printMessage);
		t2.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
