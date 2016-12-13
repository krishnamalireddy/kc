package Collection;


import java.util.*;

class HashMapDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		// Create a hash map
		HashMap<String, Double> hm = new HashMap<String, Double>();
		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Todd Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		
		
		/*TASK:May 17, 2016 :create Double object and see functions
		  Double x = new Double(30.91);
		x.byteValue();*/
		
		// Get a set of the entries
		Set set = hm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

	}
}
// Deposit 1000 into John
