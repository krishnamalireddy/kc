package Exceptions;

class Exc2 {
	public static void main(String args[]) {
		int d, a;
		try { // monitor a block of code.
			d = 0;
			System.out.println("in the try block");
			a = 42 / d;
			
			System.out.println("The res of the work in normal course");
			System.out.println("The res of the work in normal course");
			System.out.println("The res of the work in normal course");
			System.out.println("The res of the work in normal course");
		} 
		
		
		catch(Exception we)
		{
			System.out.println("I am in the catch block"+we);
			
		}
		finally 
		{
			System.out.println("This will always get executed");
			
		}
		
		
		System.out.println("After exception block normal execution continues");
		
		
	}
}
