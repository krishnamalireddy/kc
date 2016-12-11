package Interview;

public class Transient {

}

class T {
transient int a; // will not persist
int b; // will persist
}

/**
 * 
 * The volatile modifier tells the compiler that the variable modified by volatile can be
changed unexpectedly by other parts of your program. One of these situations involves
multithreaded programs. (You saw an example of this in Chapter 11.) In a multithreaded
program, sometimes, two or more threads share the same instance variable. For
efficiency considerations, each thread can keep its own, private copy of such a shared
variable. The real (or master) copy of the variable is updated at various times, such as
when a synchronized method is entered. While this approach works fine, it may be
inefficient at times. In some cases, all that really matters is that the master copy of a
variable always reflects its current state. To ensure this, simply specify the variable as
volatile, which tells the compiler that it must always use the master copy of a volatile
variable (or, at least, always keep any private copies up to date with the master copy, and
vice versa). Also, accesses to the master variable must be executed in the precise order
in which they are executed on any private copy.



By modifying a class or a method with strictfp, you ensure that
floating point calculations (and thus all truncations) take place precisely as they did in
earlier versions of Java. The truncation affects only the exponent of certain operations.
When a class is modified by strictfp, all the methods in the class are also modified by
strictfp automatically.
 */
