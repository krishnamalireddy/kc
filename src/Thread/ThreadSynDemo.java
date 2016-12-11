package Thread;


/*
 * 
 * In Java, �thread� means two different things:
 An instance of class java.lang.Thread
 A thread of execution
An instance of Thread is just�an object. Like any other object in Java, it has
variables and methods, and lives and dies on the heap. But a thread of execution is an
individual process (a �lightweight� process) that has its own call stack. In Java, there
is one thread per call stack�or, to think of it in reverse, one call stack per thread. Even
if you don�t create any new threads in your program, threads are back there running.

 Every object in Java has a built-in lock
that only comes into play when the object has synchronized method code. Since
there is only one lock per object, if one thread has picked up the lock, no other thread
can enter the synchronized code on the same object(which means any synchronized method of that
object) until the lock has been released. Typically, releasing a lock means the thread
holding the lock (in other words, the thread currently in the synchronized method)
exits the synchronized method.

If two methods are synchronized in a class, only one thread can be accessing
one of the two methods. In other words, once a thread acquires the lock on
an object, no other thread can enter any of the synchronized methods in that
class (for that object).


If a thread goes to sleep, it takes its locks with it.

 A thread can acquire more than one lock. For example, a thread can enter
a synchronized method, thus acquiring a lock, and then immediately invoke a
synchronized method on a different object, thus acquiring that lock as well.
As the stack unwinds, locks are released again. Also, if a thread acquires a lock
and then attempts to call a synchronized method on that same object, no
problem. The JVM knows that this thread already has the lock for this object,
so the thread is free to call other synchronized methods on the same object, using
the lock the thread already has.
 */

class Test {

synchronized void  display(String msg) {
		
		System.out.print("[" + msg);
		//System.out.println("currently i am inside");
		for (int i = 0; i < 3000000; i++)
		{}
		//{
			//System.out.println();
		//}
			//System.out.println("Important job running in MyRunnable")

		//try {
			//Thread.sleep(1000);
		//} catch (InterruptedException e) {
			//System.out.println("Interrupted");
		//}
		System.out.println("]");

	}

}

class NewThread implements Runnable {
	Thread t;
	String message;
	Test target;

	NewThread(String name, int prio, Test tes) {
		message = name;
		target = tes;
		// Create a new, second thread
		t = new Thread(this, name);
		
		t.setPriority(prio);
		
		t.start(); // Start the thread
	}
	

	public void run() {
		

		target.display(message);

		
	}
}

class ThreadSynDemo {

	public static void main(String args[]) {
		// create a new thread

		Test t1 = new Test();

		NewThread g1 = new NewThread("sourav", 1, t1);//
		
		NewThread g2 = new NewThread("praksh", 1, t1);
		
		
		

		System.out.println("Main thread exiting.");
		//System.out.println("Main thread exiting21212.");
	}
}