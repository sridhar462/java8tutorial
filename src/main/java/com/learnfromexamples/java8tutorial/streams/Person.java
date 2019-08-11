package com.learnfromexamples.java8tutorial.streams;

public class Person {
	private String fName;
	private String lName;
	private double salary;

	public Person(String fName, String lName, double salary) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", salary=" + salary + "]";
	}

}
