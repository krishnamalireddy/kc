// A Simple demonstration of abstract.
/*Casting
 Implicit casting (you write no code) happens when a widening conversion
occurs.
Explicit casting (you write the cast) happens when a narrowing conversion
occurs.
 Casting a floating point to an integer type causes all digits to the right of the
decimal point to be lost (truncated).
 Narrowing conversions can cause loss of data—the most significant bits
(leftmost) can be lost.

 * */
 

abstract class Abs {
	abstract void callme();
	abstract void callme1();

	// concrete methods are still allowed in abstract classes
	void callmetoo() {
		System.out.println("This is a concrete method.");
		System.out.println("This is a concrete method.");
		System.out.println("This is a concrete method.");
		
		
		
	}
}

 class Ball extends Abs {
	 void callme(){
		 
		 System.out.println("This is a concrete method calme 1.");
		 
	 }
	
	
	void callme1()
	{
		System.out.println("This is a concrete method calme 1.");
		
	}
}

class allimpl extends Ball
{
	void callme()
	{
		System.out.println("This is a concrete method callme.");
		
	}
	
}

class AbstractDemo {
	public static void main(String args[]) {
		//Abs b = new Abs();
		//b.callme();
		//b.callmetoo();
	}
}
