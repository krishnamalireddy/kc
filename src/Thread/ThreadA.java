package Thread;

//INTER THREAD COMMUNICATION
class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();

		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Total is: " + b.total);
	}
}

class ThreadB extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notify();
		}
	}
}
/*
 * This program contains two objects with threads: ThreadA contains the main thread
and ThreadB has a thread that calculates the sum of all numbers from 0 through 99.
As soon as line 4 calls the start() method, ThreadA will continue with the next
line of code in its own class, which means it could get to line 12 before ThreadB has
finished the calculation. To prevent this, we use the wait() method in line 9.

Notice in line 6 the code synchronizes itself with the object b�this is because in
order to call wait() on the object, ThreadA must own a lock on b. For a thread to
call wait() or notify(), the thread has to be the owner of the lock for that object.
When the thread waits, it temporarily releases the lock for other threads to use, but
it will need it again to continue execution. It is common to find code such as the
following:
synchronized(anotherObject) { // this has the lock on anotherObject
try {
anotherObject.wait();
// the thread releases the lock and waits
// To continue, the thread needs the lock,
// so it may be blocked until it gets it.
} catch(InterruptedException e){}
}
The preceding code waits until notify() is called on anotherObject.
synchronized(this) {
notify();
}
This code notifies any thread currently waiting on the this object.
The lock can be acquired much earlier in the code, such as in the calling method.
Note that if the thread calling wait() does not own the lock, it will throw an
IllegalMonitorStateException. This exception is not a checked exception,
so you don�t have to catch it explicitly. You should always be clear wh
 * */
