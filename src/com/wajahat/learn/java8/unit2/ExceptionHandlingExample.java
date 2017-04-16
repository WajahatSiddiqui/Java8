package com.wajahat.learn.java8.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	
	public static void main(String args[]) {
		int [] numbers = {1, 2, 3, 4};
		int key = 0;
		
		process(numbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}
	
	public static void process(int [] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : numbers) {
			consumer.accept(i, key);
		}
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> 
		{
			try {
			consumer.accept(v,  k);
			} catch (ArithmeticException e) {
				System.out.println("Exception caugth while executing the lambda: " + e.getMessage());
			}
		};
	}

}
