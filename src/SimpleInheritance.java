// A simple example of inheritance.
// Create a superclass.

class A {
 int i; 
	
	 int j;

	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

// Create a subclass by extending class A.
class B extends A {
	int k;

	void showk() {
		System.out.println("k: " + k);
	}

	int sum() {
		System.out.println("i+j+k: " + (i + j + k));
		return i + j + k;
	}
}

class SimpleInheritance {
	public static void main(String args[]) {
		A superObA = new A();
		B subObB = new B();
		// The superclass may be used by itself.
		superObA.i = 10;
		superObA.j = 20;
		System.out.println("Contents of superOb:");
		superObA.showij();
		/*System.out.println();
		/*
		 * The subclass has access to all public members of its superclass.
		 */
		subObB.i = 7;
		subObB.j = 8;
		subObB.k = 9;
	
		System.out.println("Contents of subOb: ");
		subObB.showij();
		///-------------------------
		subObB.showk();
		//System.out.println();
		System.out.println("Sum of i, j and k in subObB:" + subObB.sum());
		
	     // subObB.sum();
		
		
		
	}
}
