package com.wajahat.learn.java8.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.wajahat.learn.java8.unit1.Person;

public class MethodReferenceExample2 {
	public static void main(String args[]) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickenson", 40),
				new Person("Brownie", "Sanders", 56),
				new Person("Hercules", "Shapers", 34),
				new Person("Richard", "Stevens", 65),
				new Person("Danny", "Dozappa", 76),
				new Person("Down", "Up", 34));

		performConditionally(people, p->true, System.out::println);
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
