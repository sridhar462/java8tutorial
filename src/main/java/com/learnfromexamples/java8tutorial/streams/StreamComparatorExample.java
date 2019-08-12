package com.learnfromexamples.java8tutorial.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnfromexamples.java8tutorial.java7.Person;

public class StreamComparatorExample {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Sridharan", "Nithyanandam", 30, 12345.8),
				new Person("Ram", "Kumar", 32, 432424.8), new Person("Vijay", "Devarkonda", 23, 34345323.8),
				new Person("Atal", "Bihari", 45, 34534.8));

		System.out.println("Before Sorting");
		personList.stream().forEach(System.out::println);

		List<Person> ageSortedList = personList.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge())
				.collect(Collectors.toList());

		System.out.println("After Sorting By Age");
		ageSortedList.stream().forEach(System.out::println);

		List<Person> ageSortedDescList = personList.stream().sorted((p1, p2) -> -p1.getAge() - p2.getAge())
				.collect(Collectors.toList());

		System.out.println("After Sorting By Age - Descsending");
		ageSortedDescList.stream().forEach(System.out::println);

		Comparator<Person> comparator = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		List<Person> lastNameSortAscList = personList.stream().sorted(comparator.reversed())
				.collect(Collectors.toList());
		System.out.println("After Sorting By LastName - Ascending");
		lastNameSortAscList.stream().forEach(System.out::println);

	}

}
