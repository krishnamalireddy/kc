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

 In Java, �thread� means two different things:
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
/*
Method
M eaning
getName
O btain a thread's name.
getPriority
Obtain a thread's priority.
isAlive
Determine if a thread is still running.
join
Wait for a thread to terminate.
run
Entry point for the thread.
sleep
S uspend a thread for a period of time.
start
S tart a thread by calling its run method.

*/
/*
 To avoid polling, Java includes an elegant interprocess communication mechanism via
the wait( ), notify( ), and notifyAll( ) methods. These methods are implemented as final
methods in Object, so all classes have them. All three methods can be called only from
within a synchronized method. Although conceptually advanced from a computer
science perspective, the rules for using these methods are actually quite simple:
� wait( ) tells the calling thread to give up the monitor and go to sleep until some other
thread enters the same monitor and calls notify( ).
� notify( ) wakes up the first thread that called wait( ) on the same object.
� notifyAll( ) wakes up all the threads that called wait( ) on the same object. The
highest priority thread will run first.
These methods are declared within Object, as shown here:
final void wait( ) throws InterruptedException
final void notify( )
final void notifyAll( )
Additional forms of wait( ) exist that allow you to specify a period of time to wait.
 */


class MyRunnable1 implements Runnable {
	public void run() {

		try {

			thfun(Thread.currentThread().getName());
		} catch (InterruptedException e) {
		}


		/*try {
			synchronized(this){
			thfun(Thread.currentThread().getName());
			}

		} catch (InterruptedException e) {
		}*/


	}

	 void thfun(String msg) throws InterruptedException {

		// String msg=new String();
		System.out.print("[" + msg);
		System.out.println("currently i am inside");

		try {
			Thread.currentThread().sleep(1000);

		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");

	}
}

class MyThreatest1 {
	public static void main(String[] args) {

		// t.start();

		MyRunnable1 m1 = new MyRunnable1();

		Thread t1 = new Thread(m1, "sourav");
		System.out.println(t1.getName());
		// t1.setName("sourav");

		Thread t2 = new Thread(m1, "dutta");
		// t2.setName("dutta");

		t1.setPriority(6);

		t2.setPriority(6);

		t1.start();
		t2.start();

		try {
			t1.join();
		} catch (InterruptedException r) {
		}

		System.out.println("Hello World!");
	}
}

