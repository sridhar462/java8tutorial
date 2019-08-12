package com.learnfromexamples.java8tutorial.java7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Java7Comparator {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Sridharan", "Nithyanandam", 30, 12345.8),
				new Person("Ram", "Kumar", 32, 432424.8), new Person("Vijay", "Devarkonda", 23, 34345323.8),
				new Person("Atal", "Bihari", 45, 34534.8));

		System.out.println("Before Sorting");
		personList.stream().forEach(System.out::println);

		// Sort by Age Ascending Order
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getAge() - arg1.getAge();
			}
		});

		System.out.println("After Sorting By Age - Ascending Order");
		personList.stream().forEach(System.out::println);

		// Sort by Age Descending Order
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg1.getAge() - arg0.getAge();
			}
		});

		System.out.println("After Sorting By Age - Descending Order");
		personList.stream().forEach(System.out::println);

		// Sort by Last Name Ascending Order
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		System.out.println("After Sorting By LastName - Ascending Order");
		personList.stream().forEach(System.out::println);

		// Sort by Last Name Descending Order
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.getLastName().compareTo(o1.getLastName());
			}
		});

		System.out.println("After Sorting By LastName - Descending Order");
		personList.stream().forEach(System.out::println);

	}

}
