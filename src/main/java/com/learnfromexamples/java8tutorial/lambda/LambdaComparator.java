package com.learnfromexamples.java8tutorial.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.learnfromexamples.java8tutorial.java7.Person;

public class LambdaComparator {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Sridharan", "Nithyanandam", 30, 12345.8),
				new Person("Ram", "Kumar", 32, 432424.8), new Person("Vijay", "Devarkonda", 23, 34345323.8),
				new Person("Atal", "Bihari", 45, 34534.8));

		System.out.println("Before Sorting");
		personList.stream().forEach(System.out::println);

		// Sort by Age Ascending Order
		personList.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("After Sorting By Age - Ascending Order");
		personList.stream().forEach(System.out::println);

		// Sort by Age Descending Order
		personList.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o2.getAge() - o1.getAge();
			}
		});

		System.out.println("After Sorting By Age - Descending Order");
		personList.stream().forEach(System.out::println);

		// 	Sort by Age Ascending Order - Using Lambda Expression
		personList.sort((p1, p2) -> p1.getAge() - p2.getAge());
		System.out.println("After Sorting By Age - Ascending Order - Using Lambda Expression");
		personList.stream().forEach(System.out::println);

		// Sort by Age Descending Order - Using Lambda Expression
		Comparator<Person> personSorterDesc = (p1, p2) -> p2.getAge() - p1.getAge();
		personList.sort(personSorterDesc);
		System.out.println("After Sorting By Age - Descending Order - Using Lambda Expression");
		personList.stream().forEach(System.out::println);

		// Sort by Age Descending Order - Using Lambda Expression and reversed Method
		Comparator<Person> personSorterDescReversed = (p1, p2) -> p1.getAge() - p2.getAge();
		personList.sort(personSorterDescReversed.reversed());
		System.out.println("After Sorting By Age - Descending Order - Using Lambda Expression and reversed");
		personList.stream().forEach(System.out::println);

		// Sort by LastName Ascending Order - Using Lambda Expression
		Comparator<Person> personSortByLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		personList.sort(personSortByLastName);
		System.out.println("After Sorting By LastName - Ascending Order - Using Lambda Expression");
		personList.stream().forEach(System.out::println);

		// Sort by LastName Descending Order - Using Lambda Expression and Reversed
		Comparator<Person> personSortByLastNameReversed = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		personList.sort(personSortByLastNameReversed.reversed());
		System.out.println("After Sorting By LastName - Ascending Order - Using Lambda Expression and Reversed");
		personList.stream().forEach(System.out::println);
	}

}
