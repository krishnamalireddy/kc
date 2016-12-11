package Thread;




public class MyThreadisAlive extends Thread
{
public void run()
   {
       System.out.println("r1 ");
       try{
        Thread.sleep(500);
    }catch(InterruptedException ie){}
       
       System.out.println("r2 ");
  }
public static void main(String[] args)
{
	MyThreadisAlive t1=new MyThreadisAlive();
	MyThreadisAlive t2=new MyThreadisAlive();
t1.start(); 
t2.start();
System.out.println(t1.isAlive());
System.out.println(t2.isAlive());


//JOIN TESTING CODE
/*
 * Using join() method, we tell our thread to wait until the specifid thread completes its execution. 
 * There are overloaded versions of join() method,
 *  which allows us to specify time for which you want to wait for the specified thread to terminate.
 * */
/*
 MyThread t1=new MyThread();
MyThread t2=new MyThread();
t1.start();
 
try{
  t1.join();		//Waiting for t1 to finish
}catch(InterruptedException ie){}

t2.start();
}

 
 
 */


}
}

