package com.learnfromexamples.java8tutorial.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterExample {
	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(12, 54, 67, 654, 56, 24, 76, 23, 79);
		/**
		 * Filter even numbers
		 */
		List<Integer> evenList = integerList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		evenList.stream().forEach(System.out::println);

		List<String> stringList = Arrays.asList("Spring", "Hibernate", "Java7", "Maven", "Java8");

		/**
		 * Filter String which contains Java
		 */
		List<String> javaList = stringList.stream().filter(i -> i.contains("Java")).collect(Collectors.toList());

		javaList.stream().forEach(System.out::println);

		/**
		 * Check if Java7 present inside list
		 */
		Predicate<String> java7 = i -> i.equalsIgnoreCase("Java7");
		boolean isJava7 = stringList.stream().filter(java7).findAny().isPresent();
		System.out.println(isJava7);

		/**
		 * Get Java7 if present inside list, else null
		 */
		String java7Value = stringList.stream().filter(i -> i.equalsIgnoreCase("Java7")).findAny().orElse(null);
		System.out.println(java7Value);

		List<Person> personList = Arrays.asList(new Person("Sridhar", "Nithyanandam", 123.13),
				new Person("Ram", "Kumar", 12433.13), new Person("Vijay", "Devarkonda", 32.13));

		personList.stream().forEach(System.out::println);

		/**
		 * Filter Persons whose salary is greater than 100
		 */
		List<Person> salaryGreaterThanHundred = personList.stream().filter(person -> person.getSalary() > 100)
				.collect(Collectors.toList());
		System.out.println("----");

		salaryGreaterThanHundred.stream().forEach(System.out::println);

		/**
		 * Get Sridhar Object if present inside list, else null
		 */
		Person Sridhar = personList.stream().filter(person -> person.getfName().equalsIgnoreCase("Sridhar")).findAny()
				.orElse(null);
		System.out.println("----");

		System.out.println(Sridhar);

	}
}
