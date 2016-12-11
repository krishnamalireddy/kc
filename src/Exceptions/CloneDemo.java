package Exceptions;

// Demonstrate the clone() method.

/*The clone( ) method generates a duplicate copy
of the object on which it is called. Only classes that implement the Cloneable interface
can be cloned.*/
class TestClone implements Cloneable {
	int a;
	double b;

	// This method calls Object's clone().
	TestClone makecloneobj() {
		try {

			// call clone in Object.
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed.");
			return this;
		}
	}
}

class CloneDemo {
	public static void main(String args[]) {
		TestClone x1 = new TestClone();
		
		
		
		x1.a = 10;
		x1.b = 20.98;
		System.out.println("x1: " + x1.a + " " + x1.b);
		TestClone x2= x1.makecloneobj(); // clone x1
	
		System.out.println("x2: " + x2.a + " " + x2.b);
		System.out.println("--------------------------");
		
		x2.a =9;
		x2.b =67;
		
		System.out.println("x1: " + x1.a + " " + x1.b);
		System.out.println("x2: " + x2.a + " " + x2.b);
		
	}
}