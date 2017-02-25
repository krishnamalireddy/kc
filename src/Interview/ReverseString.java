package Interview;


import java.util.Scanner;

public class ReverseString{
   public static void main(String[] args) {
      
      
  	 
		System.out.println("enter text");
		Scanner welcome = new Scanner(System.in);
String name =welcome.nextLine();
String reverse = new StringBuffer(name).reverse().toString();
      System.out.println("\nString before reverse:"+name);
      System.out.println("String after reverse:"+reverse);
      
      
      if(name.equals(reverse)) 
    	  
    	  System.out.println("palindrome");
      else 
    	  
    	  System.out.println("not palindrome");
        
      }
   }

