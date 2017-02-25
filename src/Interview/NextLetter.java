package Interview;
import java.util.Scanner;

public class NextLetter {


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter String: ");
String str=sc.nextLine();
String output="";
char ch;
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);
if(ch=='z')
ch='a';
else if(ch=='Z')
ch='A';
else
ch++;
output+=ch;
}
System.out.print(output);
sc.close();
}
}