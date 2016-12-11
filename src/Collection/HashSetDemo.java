package Collection;


// Demonstrate HashSet.
import java.util.*;

class HashSetDemo {
	public static void main(String args[]) {
		// create a hash set
		HashSet hs = new HashSet();
		
		
		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("F");
		hs.add("B");
		//hs.remove("B");
		System.out.println(hs);
	}
}
