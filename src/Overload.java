// Demonstrate method overloading.COMPILE TIME POLYMORPHISM
/*
 * When an overloaded method is invoked, Java uses the type and/or number of arguments
as its guide to determine which version of the overloaded method to actually call. Thus,
overloaded methods must differ in the type and/or number of their parameters. While
overloaded methods may have different return types, the return type alone is insufficient
to distinguish two versions of a method. When Java encounters a call to an overloaded
method, it simply executes the version of the method whose parameters match the
arguments used in the call.
 * 
 */

//Method overloading is one of the ways that Java implements polymorphism.	
class OverloadDemo {
	void test() {
		System.out.println("No parameters");
	}

	// Overload test for one integer parameter.
	void test(int a) {
		System.out.println("a: " + a);
	}

	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// overload test for a double parameter
	double test(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}
	

}

class Overload {
	public static void main(String args[]) {
		OverloadDemo ob = new OverloadDemo();
		double result;
		// call all versions of test()
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.2);
		System.out.println("Result of ob.test(123.2): " + result);
	}
}