package BASIC;

//Using break to exit a loop.
class BreakLoop {
	public static void main(String args[]) {
		for (int i = 0; i < 5; i++) {
			if (i == 3)
				break; // terminate loop if i is 10
			System.out.println("i: " + i);
		}
		System.out.println("Loop complete.");
	}
}
