package FILEHANDLING;

import java.io.File;

public class PathFile{
	  public static void main(String[] args) throws Exception{
	  File f;
	  f=new File("myfilejjjj.txt");
	  f.createNewFile();
	  System.out.println("New file \"myfile.txt\" has been created to the specified location");
	  System.out.println("The absolute path of the file is: "
	  +f.getAbsolutePath());  
	  }
	} 

