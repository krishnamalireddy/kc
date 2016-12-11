package FILEHANDLING;

import java.io.*;

public class CreateFile1{
	  public static void main(String[] args) throws Exception{
	 
		  File f;
	  f=new File("Karthika.txt");
	  
	  
	if(!f.exists()){
	  f.createNewFile();
	  System.out.println("New file \"Karthika.txt\" has been created to the current directory");
	  
	  }
	  }  
	  
	} 
