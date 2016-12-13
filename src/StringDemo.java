// Demonstrating Strings.
/*
 * The StringBuilder class was added in Java 5. It has exactly the same API as the
StringBuffer class, except StringBuilder is not thread safe. In other words, its
methods are not synchronized.

The StringBuffer and StringBuilder Classes
The java.lang.StringBuffer and java.lang.StringBuilder classes should be used when
you have to make a lot of modifications to strings of characters. As we discussed in
the previous section, String objects are immutable, so if you choose to do a lot of
manipulations with String objects, you will end up with a lot of abandoned String
objects in the String pool.
Strings Are Immutable Objects
 */

class StringDemo {
	public static void main(String args[]) {
		String strOb1 = "First String";
		String strOb2 = "Second String";
		String strOb3 = strOb1 + " and " + strOb2;
		System.out.println(strOb1);
		System.out.println(strOb2);
		System.out.println(strOb3);
	
		String x = "airplane";
		System.out.println( x.charAt(2) ); // output is 'r'
		
		String x1 = "taxi";
		System.out.println( x1.concat(" cab") ); // output is "taxi cab"
		
		String x2 = "Exit";
		System.out.println( x.equalsIgnoreCase(x2)); // is "true"
		System.out.println( x.equalsIgnoreCase("tixe")); // is "false"
		
		String xx = "0123456789"; // as if by magic, the value
		// of each char
		// is the same as its index!
		System.out.println( xx.substring(5) ); // output is "56789"
		System.out.println( xx.substring(5, 8)); // output is "567"
		
		String xq = "A New Moon";
		System.out.println( xq.toUpperCase() ); // output is
		// "A NEW MOON"
		
		String xw = " hi ";
		System.out.println( xw + "Everyone" ); // result is
		// " hi x"
		System.out.println( xw.trim() + "er"); // result is "hix"
		
	
	}
}











