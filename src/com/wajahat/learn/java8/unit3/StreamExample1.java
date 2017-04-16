package com.wajahat.learn.java8.unit3;

import java.util.Arrays;
import java.util.List;

import com.wajahat.learn.java8.unit1.Person;

public class StreamExample1 {
	
	public static void main(String args[]) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickenson", 40),
				new Person("Brownie", "Sanders", 56),
				new Person("Hercules", "Shapers", 34),
				new Person("Richard", "Stevens", 65),
				new Person("Danny", "Dozappa", 76),
				new Person("Down", "Up", 34));
		people.stream()
			  .filter(p->p.getLastName().startsWith("S"))
			  .forEach(p->System.out.println(p));
		
		// Count the number of people whose last name starts with D
		// Notice that this is doing  parallel operation
		System.out.println(people.parallelStream()
			  .filter(p->p.getLastName().startsWith("D"))
			  .count());
		
		// In java 7, sequential operation
		int count= 0;
		for (Person p : people) {
			if (p.getLastName().startsWith("D")) count++;
		}
		System.out.println(count);
	}

}
