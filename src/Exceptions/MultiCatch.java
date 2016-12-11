package Exceptions;


// Demonstrate multiple catch statements.
class MultiCatch {
	public static void main(String args[]) {
		try {
			int a = 1;
			System.out.println("a = " + a);
			int b = 42 / a;
			
			int c[] = { 88 };
			c[42] = 99;
			
			System.out.println("i will not get executed ");
			System.out.println("i will not get executed ");
			System.out.println("i will not get executed ");
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		} catch (Exception e) {
			System.out.println("Array index oob: " + e);
		}
		System.out.println("After try/catch blocks.");
	}
}
