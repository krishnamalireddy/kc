package AccessTest;

import BASIC.BasicTest;

/* 
 * Member Access and Inheritance
 * In a class hierarchy, private members remain
private to their class.
This program contains an error and will not
compile.
*/
// Create a superclass.
class Aa {
	 int i; // public by default
	protected int j; // private to A

	void setij(int x, int y) {
		i = x;
		j = y;
	}
}

// A's j is not accessible here.
class Bb extends Aa {
	int total;

	void sum() {
	//total = i + j; // ERROR, j is not accessible here
	}
}

class XX extends BasicTest {
	int total;

	void sum() {
		//total = i + j; // ERROR, j is not accessible here
	}
}


class XZ {
	int total;

	void sum() {
		
		Aa v=new Aa();
		v.i=10;
		v.j=10;
		
	}
}



class Access {
	public static void main(String args[]) {
		Bb subOb = new Bb();
		subOb.setij(10, 12);
		subOb.sum();
		System.out.println("Total is " + subOb.total);
		
		
		Aa myobj=new Aa();
		myobj.j=10;
	}
}