package BASIC;

//Demonstrate continue.
class Continue {
	public static void main(String args[]) {
		for (int i = 0; i < 4; i++) {
			System.out.print(i + " ");
			if (i == 3)
				continue;
			System.out.println();
		}

	}
}
