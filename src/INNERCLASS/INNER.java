package INNERCLASS;

//**********************ANNONOMOUS INNER WITHIN AURGMENT*******************************************
class MyWonderfulClass {

	void go() {
		Bar b = new Bar();
		b.doStuff(new Foo() {
			public void foof() {
				System.out.println("foofy");
			} // end foof method
		}); // end inner class def, arg, and end statement
	} // end go()
} // end class MyWonderfulClass

interface Foo {
	void foof();
}

class Bar {
	void doStuff(Foo f) {
	}
}
// ******************ANNONOMOUS INNER INTERFACE**********************

interface Cookable {
	public void cook();
}

class Foodnew {
	Cookable c = new Cookable() {
		public void cook() {
			System.out.println("anonymous cookable implementer");
		}// anonomous class can only implement method in cookable interface

	};

	public void call_ano_interface() {
		c.cook();

	}
}

// *********************ANNONOMOUS INNER*******************************
class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}

class Food {
	Popcorn p = new Popcorn() {// anonomous can and must only override methods
								// not implement new one
		public void pop() {
			System.out.println("anonymous popcorn");
		}

		@SuppressWarnings("unused")
		public void sizzele()// cant dothis since Popcorn doesnt have it
		{
			System.out.println("ano claas implementing new method");
		}

	};

	void ca_pop_diplay() {
		Food h1 = new Food();
		p.pop();
		Popcorn k1 = new Popcorn();

		h1.p.pop();
		k1.pop();
	}
}

// ***********************METHOD INNER
// CLASS**************************************
class MyOuter2 {
	private String x = "Outer2";

	void doStuff() {
		final String z = "local variable";// mark final to access in inner class
		final class MyInner {
			public void seeOuter() {
				System.out.println("Outerof method innerclass x is " + x);

				System.out.println("Local variable z is " + z); // Won't
																// Compile!
			} // close inner class method

		} // close inner class definition

		MyInner mi = new MyInner(); // This line must come
		// after the class
		mi.seeOuter();

	} // close outer class method doStuff()

} //
// *************************************************************

// STATIC INNER
class BigOuter {
	public static class Nested {
		public static void Hello() {
			System.out.println("Hello...I am ne99999999999999sted!");
		}
	}

	public static void Hello() {
		System.out.println("Hello...I am outside!");
	}

	public static void Hello1() {
		Nested.Hello();
	}

}

class MyOuter {
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}

	public void seeineer() {
		// System.out.println("inner y is " + y);

	}

	class MyInner {

		int y;

		public void seeOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Inner class ref is " + this);
			System.out.println("Outer class ref is " + MyOuter.this);

		}
	}
}

class INNER {

	public static void main(String[] args) {

		MyOuter m12 = new MyOuter();

		 m12.makeInner();
		// BigOuter n = new BigOuter(); //Use both class names
		// n.Hello();
		// n.Hello1();
		//BigOuter.Nested n1 = new BigOuter.Nested();
		//n1.Hello();
		// BigOuter n = new BigOuter();
		// BigOuter.Nested nn = new Nested();
		// nn.Hello();

		//MyOuter mo = new MyOuter();
		//MyOuter.MyInner inner = mo.new MyInner();
		//inner.seeOuter();

		//MyOuter2 m1 = new MyOuter2();
		//m1.doStuff();
		//Food f1 = new Food();

		//f1.ca_pop_diplay();

		//Foodnew i = new Foodnew();
		//i.c.cook();
	}
}