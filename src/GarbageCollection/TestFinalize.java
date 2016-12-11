package GarbageCollection;

interface xyz {

	static final int f=10;//static final
}

class finalltest {

	void dox() {

		try {
		} catch (Exception e) {
		} finally {
		}

	}

}

final class abc {

	final void dosomething() {
		System.out.println("final method cant be overridden");

		// The methods getClass( ), notify( ), notifyAll( ), and wait( ) are
		// declared as final

	}

}

class FinClass {

	final int FILE_NEW = 1;

	FinClass() {

		System.out.println("This is a constructor");
	}

	public void finalize() {

		System.out.println("finalize() method called");

		// The Java run time
		// calls that method whenever it is about to recycle an object of that
		// class.
		//
	}
}

class TestFinalize {

	public static void main(String args[]) {

		FinClass fc = new FinClass();
		System.out.println("System.gc() is called in the next statement");
		fc = null;// Set fc to null to break all references to it so when you
					// call the garbage collector it will run the finalize
					// method.
		Runtime.getRuntime().gc();
	}
}
