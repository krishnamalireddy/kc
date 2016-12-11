package JAVAREGX;

//Demonstrate Arrays
import java.util.*;

class ArraysDemo {

	/*
	 * Java 2 added a new class to java.util called Arrays. This class provides
	 * various methods that are useful when working with arrays. Although these
	 * methods technically aren't part of the collections framework, they help
	 * bridge the gap between collections and arrays.
	 */

	public static void main(String args[]) {
		// allocate and initialize array
		int array[] = new int[10];
		
		for (int i = 0; i < 10; i++)
		{
			array[i] = -3 * i;
		}
			// display, sort, display
		System.out.print("Original contents: ");
		
		display(array);
		Arrays.sort(array);
		System.out.print("Sorted: ");
		display(array);
		
		double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
		double result = 0;
		int i;
		for(i=0; i<5; i++)
		result = result + nums[i];
		System.out.println("Average is " + result / 5);

	}

	static void display(int array[]) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("");
	}
}
