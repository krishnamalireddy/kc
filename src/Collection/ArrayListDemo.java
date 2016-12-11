
// Demonstrate ArrayList.

// Collection framework provides many important classes and interfaces to collect and organize group of alike objects. 
/*
 * Important Interfaces of Collection API

Interface

Description

Collection Enables you to work with groups of object; it is at the top of collection hierarchy 
Deque Extends queue to handle double ended queue. 
List Extends collection to handle sequences list of object. 
Queue Extends collection to handle special kind of list in which element are removed only from the head. 
Set Extends collection to handle sets, which must contain unique element. 
SortedSet Extends sets to handle sorted set. 

The Collection Interface
1.It is at the top of collection hierarchy and must be implemented by any class that defines a collection. Its general declaration is,
interface Collection < E >

2.Following are some of the commonly used methods in this interface.


Methods

Description


add( E obj ) Used to add objects to a collection. Doesn't add duplicate elements to the collection. 
addAll( Collection C ) Add all elements of collection C to the invoking collection 
remove( Object obj ) To remove an object from collection 
removeAll( Collection C ) Removes all element of collection C from the invoking collection 
contains( Object obj ) To determine whether an object is present in collection or not 
isEmpty() Returns true if collection is empty, else returns false 
size() returns number of elements present in collection 

 * 
 *///The List Interface
/*
 * 1.It extends the Collection Interface, and defines storage as sequence of elements. Following is its general declaration,
interface List < E >

2.Allows random access and insertion, based on position.
3.It allows Duplicate elements.
4.Apart from methods of Collection Interface, it adds following methods of its own


The Collection classes

Java provides a set of Collection classes that implements Collection interface. Some of these classes provide full implementations that can be used as it is and other abstract classes provides skeletal implementations that can be used as starting points for creating concrete collections. 


ArrayList class
1.ArrayList class extends AbstractList class and implements the List interface.
2.ArrayList supports dynamic array that can grow as needed. ArrayList has three constructors.

 * 
 */

package Collection;
import java.util.*;

class ArrayListDemo {
	public static void main(String args[]) {
		// create an array list
		ArrayList al = new ArrayList();
		System.out.println("Initial size of al: " + al.size());
		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("B");
		al.add("D");
		al.add("F");
		
		/* TASK: 17 May, 2016
		 	Check if linked list functions work in array list
		 	
		al.addFirst("S");
		al.removeLast();
		ANSWER: NO    */
		
		al.add(1, "A2");
		System.out.println("Size of al after additions: " + al.size());
		// display the array list
		System.out.println("Contents of al: " + al);
		// Remove elements from the array list
		al.remove("F");
		al.remove(2);
		
	
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
	}
}
