package Interview;

import java.util.Scanner;

public class Vowels
{
   public static void main(String args[])
   {
       String alpha, bates;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       alpha = scan.nextLine();
       
       System.out.print("Removing Vowels from The String [" +alpha+ "]\n");
       bates= alpha.replaceAll("[aeiouAEIOU]", "");
	   
       System.out.print("All Vowels Removed Successfully..!!\nNow the String is :\n");
              
       System.out.print(bates);
   }
}