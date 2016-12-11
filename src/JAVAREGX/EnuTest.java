package JAVAREGX;
/*
 * The Enumeration interface defines the methods by which you can enumerate (obtain one at a time) the elements in a collection of objects.

This legacy interface has been superceded by Iterator. Although not deprecated,
 Enumeration is considered obsolete for new code. However, it is used by several methods defined by the legacy classes such as Vector and Properties, is used by several other API classes, and is currently in widespread use in application code.

 * 
 */

import java.util.Vector;
import java.util.Enumeration;

/*
 * The first form creates a default vector, which has an initial size of 10. The second form
creates a vector whose initial capacity is specified by size. The third form creates a vector
whose initial capacity is specified by size and whose increment is specified by incr. The
increment specifies the number of elements to allocate each time that a vector is resized
upward. The fourth form creates a vector that contains the elements of collection c. This
constructor was added by Java 2.
All vectors start with an initial capacity. After this initial capacity is reached, the next time
that you attempt to store an object in the vector, the vector automatically allocates space
for that object plus extra room for additional objects. By allocating more than just the
required memory, the vector reduces the number of allocations that must take place. This
reduction is important, because allocations are costly in terms of time. The amount of
extra space allocated during each reallocation is determined by the increment that you
specify when you create the vector. If you don't specify an increment, the vector's size is
doubled by each allocation cycle.
 */

public class EnuTest {

   public static void main(String args[]) {
      Enumeration days;
      Vector dayNames = new Vector();
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      
      days = dayNames.elements();
      
      
      while (days.hasMoreElements()){
         System.out.println(days.nextElement()); 
      }
   }
}

