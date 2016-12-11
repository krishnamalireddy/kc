package Exceptions;


// Demonstrate when constructors are called.
// Create a super class.
class Aqq {
	Aqq() {
		System.out.println("Inside A's constructor.");
	}
}

// Create a subclass by extending class A.
class Bss extends Aqq {
	Bss() {
		System.out.println("Inside B's constructor.");
	}
}

// Create another subclass by extending B.
class Css extends Bss {
	Css() {
		System.out.println("Inside C's constructor.");
	}
	
	void doprint()
	{
		
		System.out.println("Inside C's function");
	}
}

class CallingCons {
	public static void main(String args[]) {
		Css cnameobj = new Css();
		
		cnameobj.doprint();
	}
}
