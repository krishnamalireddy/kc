package Exceptions;


// Method overriding.
class Aww {
	int i, j;

	Aww(int a, int b) {
		i = a;
		j = b;
	}

	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class Bww extends Aww {
	int k;

	Bww(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// display k � this overrides show() in A
	void show() {
		System.out.println("k: " + k);
	}
}

class Override {
	public static void main(String args[]) {
		Bww subOb = new Bww(1, 2, 3);
		subOb.show(); // this calls show() in B
	}
}
