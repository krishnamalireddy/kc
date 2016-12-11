/*
 * 
 * RUN TIME POLYMORPHISM
 * Method overriding forms
the basis for one of Java's most powerful concepts: dynamic method dispatch. Dynamic
method dispatch is the mechanism by which a call to an overridden function is resolved
at run time, rather than compile time. Dynamic method dispatch is important because this
is how Java implements run-time polymorphism.

Let's begin by restating an important principle: a superclass reference variable can refer
to a subclass object. Java uses this fact to resolve calls to overridden methods at run
time. Here is how. When an overridden method is called through a superclass reference,
Java determines which version of that method to execute based upon the type of the
object being referred to at the time the call occurs. Thus, this determination is made at
run time. When different types of objects are referred to, different versions of an
overridden method will be called. In other words, it is the type of the object being referred
to (not the type of the reference variable) that determines which version of an overridden
method will be executed. Therefore, if a superclass contains a method that is overridden
by a subclass, then when different types of objects are referred to through a superclass
reference variable, different versions of the method are executed.

Why Overridden Methods?
As stated earlier, overridden methods allow Java to support run-time polymorphism.
Polymorphism is essential to object-oriented programming for one reason: it allows a
general class to specify methods that will be common to all of its derivatives, while
allowing subclasses to define the specific implementation of some or all of those
methods. Overridden methods are another way that Java implements the "one interface,
multiple methods" aspect of polymorphism.
Part of the key to successfully applying polymorphism is understanding that the
superclasses and subclasses form a hierarchy which moves from lesser to greater
specialization. Used correctly, the superclass provides all elements that a subclass can
use directly. It also defines those methods that the derived class must implement on its
own. This allows the subclass the flexibility to define its own methods, yet still enforces a
consistent interface. Thus, by combining inheritance with overridden methods, a
superclass can define the general form of the methods that will be used by all of its
subclasses.
 * 
 * */
class Air {
	void callme() {
		System.out.println("Inside Air's callme method farming fater style");
	}
}

class Bol extends Air {
	void callme() {
		System.out.println("Inside Bol's callme method farming fater style");
	}
	
	
}

class Col extends Air {
	void callme() {
		System.out.println("Inside Cols callme method farming fater style");
	}
	
}

class Dispatch {
	public static void main(String args[]) {
		Air a = new Air(); // object of type A
		Bol b = new Bol(); // object of type B
	    Col c = new Col(); // object of type C
		Air r; // obtain a reference of type A
		//Object obrefn;
		
		r = a; // r refers to an A object
		r.callme(); // calls A's version of callme
	
		r = b; // r refers to a B object
		r.callme(); // calls B's version of callme
		r = c; // r refers to a C object
		r.callme(); // calls C's version of callme
	}
}
