package Interview;

import java.util.Scanner;

class Seri {
public static void main(String[] args)
{
    int f1[] = {1, 1};
    	
    
    System.out.println("Enter the value of n : ");
  Scanner scan =new Scanner (System.in);
  int	s, i;
  int n = scan.nextInt();
      for(i = 0; i < n; i++)
      {
          if(i < 2)
            System.out.printf("%d\n", f1[i]);
          else 
           {
               s = f1[0] +f1[1];
               if((i+1)%4 == 0)
                     s *= 4;
               System.out.printf("%d\n", s);
                      f1[0] = f1[1];
                       f1[1] = s;
        
           }}}
}/*
import java.util.Scanner;
class Seri{
public static void main(String[] args){
int a = 1;
int b = 1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the limit of the sequence:");
int n = sc.nextInt();
int c=1;
for(int i = 0; i < n; i++){
if(i < 2)
System.out.println(a);
else
{
c = a +b;
if((i+1)%4 == 0)
c *= 4;
System.out.println(c);
a = b;
b = c;
}

}
}
}*/