package FILEHANDLING;

import java.io.*;  
class S{  
 public static void main(String args[])throws Exception{  
 FileOutputStream fout1=new FileOutputStream("f1.txt");  
  FileOutputStream fout2=new FileOutputStream("f2.txt");  
 
  ByteArrayOutputStream bout=new ByteArrayOutputStream();  
  //bout.write(139); 
  //bout.write(1);
  bout.write(90);
  bout.writeTo(fout1);  
  bout.writeTo(fout2);  
 
bout.flush();  
  bout.close();//has no effect  
  System.out.println("successljjjljjkjk...");  
 }  
}   
