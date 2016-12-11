package Interview;
public class ReverseString{
   public static void main(String[] args){
      String name="krishna";
      String reverse = new StringBuffer(name).
      reverse().toString();
      System.out.println("\nString before reverse:"+name);
      System.out.println("String after reverse:"+reverse);
   }
}
