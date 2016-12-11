package Exceptions;

import java.util.*;

class Person1 implements Comparable {
	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Object anotherPerson) throws ClassCastException {
		if (!(anotherPerson instanceof Person1))
			throw new ClassCastException("A Person object expected.");
		int anotherPersonAge = ((Person1) anotherPerson).getAge();
		return this.age - anotherPersonAge;
	}
}

public class TestComparable {

	public static void main(String[] args) {
		Person1[] persons = new Person1[4];
		persons[0] = new Person1();
		persons[0].setFirstName("Elvis");
		persons[0].setLastName("Goodyear");
		persons[0].setAge(56);

		persons[1] = new Person1();
		persons[1].setFirstName("Stanley");
		persons[1].setLastName("Clark");
		persons[1].setAge(8);

		persons[2] = new Person1();
		persons[2].setFirstName("Jane");
		persons[2].setLastName("Graff");
		persons[2].setAge(16);

		persons[3] = new Person1();
		persons[3].setFirstName("Nancy");
		persons[3].setLastName("Goodyear");
		persons[3].setAge(69);

		System.out.println("Natural Order");

		for (int i = 0; i < 4; i++) {
			Person1 person = persons[i];
			String lastName = person.getLastName();
			String firstName = person.getFirstName();
			int age = person.getAge();
			System.out.println(lastName + ", " + firstName + ". Age:" + age);
		}

		Arrays.sort(persons);

		System.out.println();
		System.out.println("Sorted by age");

		for (int i = 0; i < 4; i++) {
			Person1 person = persons[i];
			String lastName = person.getLastName();
			String firstName = person.getFirstName();
			int age = person.getAge();
			System.out.println(lastName + ", " + firstName + ". Age:" + age);
		}

	}
}
