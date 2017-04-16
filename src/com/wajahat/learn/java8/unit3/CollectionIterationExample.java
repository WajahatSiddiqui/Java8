package com.wajahat.learn.java8.unit3;

import java.util.Arrays;
import java.util.List;

import com.wajahat.learn.java8.unit1.Person;

public class CollectionIterationExample {
	public static void main(String args[]) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickenson", 40),
				new Person("Brownie", "Sanders", 56),
				new Person("Hercules", "Shapers", 34),
				new Person("Richard", "Stevens", 65),
				new Person("Danny", "Dozappa", 76),
				new Person("Down", "Up", 34));
		
		System.out.println("for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("for in loop");
		for (Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("forEach loop");
		people.forEach(p->System.out.println(p));
		
		System.out.println("forEach loop Method Reference");
		people.forEach(System.out::println);
	}
}
