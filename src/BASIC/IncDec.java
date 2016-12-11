package BASIC;

//Demonstrate ++.
class IncDec {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c;
		int d;
		c = ++b;
		d = a++;
		c++;
		
		//-----
		int z=1;
		
		int v=z++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		
		System.out.println("z = " + z);
		System.out.println("v = " + v);
	}
}
