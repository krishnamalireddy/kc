package Interview;
 import java.util.Scanner;
 
public class FActorial{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the number whose factorial you want: ");
int n = in.nextInt();
int f =1;
for(int i=n; i>0; i--){
f = f*i;
}
System.out.println("Factorial of "+n+" is "+f);
}
}


/*
 class FActorial{  
	 public static void main(String args[]){  
	  int i,fact=1;  
	  int number=4;//It is the number to calculate factorial    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
	}  



*/
/*
 * import java.util.Scanner;

public class FActorial{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the number whose factorial you want: ");
int n = in.nextInt();
int f =1;
for(int i=1; i<=0; i++){
f = f*i;
}
System.out.println("Factorial of "+n+" is "+f);
}
}
*/
