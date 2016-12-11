package GenericsJava;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest
{
   // generic method printArray                         
   public static < E > void printArray( E[] inputArray )
   {
      // Display array elements              
         for ( E element : inputArray ){        
            System.out.println( element );
         }
         System.out.println();
    }

    public static void main( String args[] )
    {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // pass a Character array
        
        
       // List<String> mylist = new ArrayList<String>();

       // mylist.add("a String");
        //mylist.add(1);

    
       // String aString = mylist.get(0);//no type casting required
        
        //-----
       // List list = new ArrayList();

       /// list.add(new Integer(2));
        //list.add("a String");
        
        //List list11 = new ArrayList();
        //list11.add("hello");
        //list11.add(222);
        //String s = (String) list.get(0);//typecasting required

        
//--------------------
        
        

        
    } 
}
