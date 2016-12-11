package Interview;
/*import java.util.Scanner;

public class Primes {
 
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter  number: ");
	
int n=in.nextInt();
int count=0;
 System.out.println("The prime numbers below n are :");
for(int i=2;i<=n;i++){
 
count=0;
 
for(int j=2;j<=i/2;j++){
 
if(i%j==0){
count++;
break;
}
 
}
 
if(count==0){
 
System.out.println(i);
 
}
 
}
 
}
 */












import java.util.Scanner;

public class Primes {
 
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter  number: ");
	
int n=in.nextInt();

 System.out.println("The prime numbers below n are :");
for(int i=2;i<=n;i++){
 
	boolean flag=true;
for(int j=2;j<i;j++){
 
if(i%j==0){
flag=false;
}
 
}
 
if (flag==true){
System.out.println(i);
}
}
 
}
 
}
