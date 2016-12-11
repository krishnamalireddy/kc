package REFLECTION;

class Simple2 {
}

interface My {
}

class Test2 {
	public static void main(String args[]) throws Exception {
		try {
			Class c = Class.forName("Simple2");
			System.out.println(c.isInterface());

			Class c2 = Class.forName("My2");
			System.out.println(c2.isInterface());

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
