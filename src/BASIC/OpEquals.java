package BASIC;

//Demonstrate several assignment operators.
class OpEquals {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		double c = 7;
		a += 5;
		b *= 4;
		//c += a * b;
		c =c % 4;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
