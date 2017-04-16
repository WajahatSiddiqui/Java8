package com.wajahat.learn.java8.unit2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.wajahat.learn.java8.unit1.Person;

public class FunctionalInterfaceExample {
	public static void main(String args[]) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickenson", 40),
				new Person("Brownie", "Sanders", 56),
				new Person("Hercules", "Shapers", 34),
				new Person("Richard", "Stevens", 65),
				new Person("Danny", "Dozappa", 76),
				new Person("Down", "Up", 34));

		// Sort the people whose last name starts with D
		people.sort((o1, o2)-> o1.getLastName().compareTo(o2.getLastName()));

		// Step1: print the list of people
		System.out.println("Printing the List of people");
		performConditionally(people, p->true, p->System.out.println(p));

		// Step2: print the list of people whose last name starts with D
		System.out.println("Printing the List of people whose last name starts with D");
		performConditionally(people, p->p.getLastName().startsWith("D"),
				p->System.out.println(p.getLastName()));

		// Step3: print the list of people whose fist name starts with D
		System.out.println("Printing the List of people whose fist name starts with D");
		performConditionally(people,  p->p.getFirstName().startsWith("D"),
				p->System.out.println(p.getFirstName()));
	}

	public static void performConditionally(List<Person> people,
			Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
