package Thread;


/*/
 *
 * 
 * In Java, �thread� means two different things:
 An instance of class java.lang.Thread
 A thread of execution
An instance of Thread is just�an object. Like any other object in Java, it has
variables and methods, and lives and dies on the heap. But a thread of execution is an
individual process (a �lightweight� process) that has its own call stack. In Java, there
is one thread per call stack�or, to think of it in reverse, one call stack per thread. Even
if you don�t create any new threads in your program, threads are back there running
If you create a thread using the no-arg constructor, the thread will call its own
run() method when it�s time to start working. That�s exactly what you want when
you extend Thread, but when you use Runnable, you need to tell the new thread to
use your run() method rather than its own.

The Runnable you pass to the Thread
constructor is called the target or the target Runnable.
You can pass a single Runnable instance to multiple Thread objects, so that the
same Runnable becomes the target of multiple threads

 */
/*

class MyThread extends Thread
	public void run() {
		System.out.println("Important job running"+" "
				+ Thread.currentThread().getName());
	}

}*/

class MyRunnable implements Runnable {
	public void run() {

		try {
			thfun();
		} catch (InterruptedException e) {
		
			System.out.println(e);
		
		}

	}

	void thfun() throws InterruptedException {

		//Thread.sleep(1000);
		//for (int i = 0; i < 3; i++)
			System.out.println("Important job running in MyRunnable"+" "
		+ Thread.currentThread().getName());

	}
}

class MyThreatest {
	public static void main(String[] args) {
		/*MyThread t = new MyThread();
		
		
	     t.setName("Prakash");
		 t.start();*/

	     MyRunnable m1 = new MyRunnable();

		Thread t1 = new Thread(m1);
		 t1.setName("sourav");
		   
		//Thread t2 = new Thread(m1);
		 //t2.setName("tamal");
		 
		//t1.setPriority(1);

       // t2.setPriority(1);
		 
		 t1.start(); 
		 //t2.start();

		

		/*try {
		t2.join();//this helps in forcing main tred to wait till t1 thread finishes
		
		} catch (InterruptedException r) {
		}*/

	System.out.println("main thread finishing");
	}
}
