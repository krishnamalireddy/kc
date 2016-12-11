
// One interface can extend another.
/*
 * Polymorphism (from the Greek, meaning "many forms") is a feature that allows one
interface to be used for a general class of actions
polymorphism is often expressed by the phrase "one
interface, multiple methods." This means that it is possible to design a generic interface
to a group of related activities. This helps reduce complexity by allowing the same
interface to be used to specify a general class of action. It is the compiler's job to select
the specific action (that is, method) as it applies to each situation. You, the programmer,
do not need to make this selection manually. You need only remember and utilize the
general interface.
 * 
 */


interface Aapps {
	void meth1();

	void meth2();
	
	//static final 
	
	int a=8;
}

// B now includes meth1() and meth2() — it adds meth3().
interface Bass extends Aapps {
	void meth3();
}

// This class must implement all of A and B
 class MyClassa implements Bass {
	public void meth1() {
		System.out.println("Implement meth1().");
	}

	public void meth2() {
		System.out.println("Implement meth2().");
	}
     
	 public void meth3(){
		System.out.println("Implement meth3().");
	}
	
}

class IFExtend {
	public static void main(String arg[]) {
	/*	MyClassa ob = new MyClassa();
	ob.meth1();
		ob.meth2();
		//ob.meth3();*/
	}
}
