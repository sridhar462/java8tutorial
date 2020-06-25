package com.learnfromexamples.java8tutorial.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachList {

	static List<String> getLists() {
		List<String> lists = new ArrayList<String>();
		lists.add("One");
		lists.add("Two");
		lists.add("Three");
		lists.add("Four");
		lists.add("Five");
		return lists;
	}

	public static void main(String[] args) {
		printUsingEnhancedLoop();
		printWithoutMethodRef();
		printWithMethodRef();
		printUsingFilterOne();
		printUsingFilterTwo();
		
	}

	public static void printUsingEnhancedLoop() {
		System.out.println("Using Enhanced Loop");
		for (String value : getLists()) {
			System.out.println(value);
		}
	}

	public static void printWithoutMethodRef() {
		System.out.println("Without Method Reference");
		getLists().forEach(value -> System.out.println(value));
	}

	public static void printWithMethodRef() {
		System.out.println("With Method Reference");
		getLists().forEach(System.out::println);
	}

	public static void printUsingFilterOne() {
		System.out.println("Conditional Statement");
		getLists().forEach(value -> {
			if (value.equals("One")) {
				System.out.println(value);
			}
		});
	}

	public static void printUsingFilterTwo() {
		System.out.println("Using Filter");
		getLists().stream().filter(value -> value.equals("Two")).forEach(System.out::println);
	}
}
