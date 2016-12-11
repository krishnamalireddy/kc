package Properties;

class Elapsed {
	public static void main(String args[]) throws InterruptedException {
		long start, end;
		System.out.println("Timing a for loop from 0 to 1,000,000");
		// time a for loop from 0 to 1,000,000
		start = System.currentTimeMillis(); // get starting time
		
		
		for (int i = 0; i < 10; i++)
			
		{
			Thread.sleep(10);
		}
		end = System.currentTimeMillis(); // get ending time
		System.out.println("Elapsed time: " + (end - start));
	}
}
