package REFLECTION;

class Test123 {
	void message() {

		System.out.println("dsfsdf");
	}

	public static void main(String args[]) throws Exception {
		
		
		Class c = boolean.class;
		System.out.println(c.getName());

		Class c2 = Test123.class;
		System.out.println(c2.getName());
		//System.out.println(c2.getMethods().toString());
		

		Test123 s = (Test123) c2.newInstance();
		s.message();

	}
}
