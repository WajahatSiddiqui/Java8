package com.wajahat.learn.java8.unit1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Unit1ExecerciseJava7 {
	public static void main(String args[]) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickenson", 40),
				new Person("Brownie", "Sanders", 56),
				new Person("Hercules", "Shapers", 34),
				new Person("Richard", "Stevens", 65),
				new Person("Danny", "Dozappa", 76),
				new Person("Down", "Up", 34));

		// Sort the people whose last name starts with D
		people.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Step1: print the list of people
		System.out.println("Printing the List of people");
		printList(people);

		// Step2: print the list of people whose last name starts with D
		System.out.println("Printing the List of people whose last name starts with D");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("D");
			}
		});

		// Step3: print the list of people whose fist name starts with D
		System.out.println("Printing the List of people whose fist name starts with D");

		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("D");
			}
		});
	}

	public static void printList(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

	public static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}
}

interface Condition {
	public boolean test(Person p);
}
