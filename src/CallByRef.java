
class Test12 {
	int a, b;

	Test12(int i, int j) {
		a = i;
		b = j;
	}

	// pass an object
	void meth(Test12 o) {
		o.a *= 2;
		o.b /= 2;
	}
}

class CallByRef {
	public static void main(String args[]) {
		Test12 ob = new Test12(15, 20);
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		ob.meth(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
	}
}
