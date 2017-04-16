package com.wajahat.learn.java8.unit1;

public class PrintStringLength {
	public static int printLength(StringLengthLambda stringLengthLambda, String s) {
		return stringLengthLambda.getLength(s);
	}
	public static void main(String[] args) {
		System.out.println(printLength(s->s.length(), "Hello World!"));

	}
}

interface StringLengthLambda {
	int getLength(String s);
}
