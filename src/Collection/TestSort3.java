package Collection;
/*
 * The Collections class consists of static methods that exclusively operates on collections and returns collections.
 *  It contains polymorphic algorithms that operate on collections, "wrappers", which return a new collection backed 
 *  by a specified collection, and a few other odds and ends. 
 *  The methods of Collections class all throw a NullPointerException 
 *  if the collections or class objects provided to them are null -
 *  See more at: http://java2novice.com/java-collections-and-util/collections/#sthash.8wlguBWf.dpuf
 */

import java.util.*;
import java.io.*;

class TestSort3 {
	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + "" + st.name + "" + st.age);
		}
	}
}

class Student implements Comparable {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object obj) {
		Student st = (Student) obj;
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

}
