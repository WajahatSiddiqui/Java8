package com.wajahat.learn.java8.unit1;

public class Greeter {
	
	public void greet(Greetings greetings) {
		greetings.perform();
	}

	public static void main(String[] args) {
		//new Greeter().greet(new HelloWorldGreetings());
		Greetings greetingsLambda = () -> System.out.println("HelloWorld!");
		new Greeter().greet(greetingsLambda);
		new Greeter().greet(()->System.out.println("HelloWorld!"));
	}
}
