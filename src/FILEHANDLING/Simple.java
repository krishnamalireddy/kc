package FILEHANDLING;

import java.io.*;  
class Simple{  
  public static void main(String args[])throws Exception{  
   FileInputStream fin1=new FileInputStream("f1.txt");  
   FileInputStream fin2=new FileInputStream("f2.txt");  
 
   SequenceInputStream sis=new SequenceInputStream(fin2,fin1);  
   int i;  
  while((i=sis.read())!=-1){  
    System.out.println((char)i);  
   }  
   sis.close();  
   fin1.close();  
   fin2.close();  
  }  
}  

