package Properties;

/*
 * The properties object contains key and value pair both as a string.
 It is the subclass of Hashtable. 

It can be used to get property value based on the property key. The Properties class provides methods to get data from properties file and store data into properties file. Moreover, it can be used to get properties of system.
Byte Streams

Java byte streams are used to perform input and output of 8-bit bytes.
 Though there are many classes related to byte streams but the most frequently used classes are , 
 FileInputStream and FileOutputStream
 
 Character Streams

Java Byte streams are used to perform input and output of 8-bit bytes, 
where as Java Character streams are used to perform input and output for 16-bit unicode.
 Though there are many classes related to character streams but the most frequently used classes are , 
 FileReader  and FileWriter.. Though internally FileReader uses FileInputStream and FileWriter uses FileOutputStream
  but here major difference is that FileReader reads two bytes at a time and FileWriter writes two bytes at a time


 */

import java.util.*;
import java.io.*;

public class TestPropertiesfile {
	public static void main(String[] args) throws Exception {

		File f;
		f = new File("db.properties");

		if (!f.exists()) {
			f.createNewFile();
		}

		FileInputStream fin = new FileInputStream("kkk.txt");
		FileOutputStream fout = new FileOutputStream("db.properties");
		int i = 0;
		while ((i = fin.read()) != -1) {
			fout.write((byte) i);

		}
		fin.close();

		fout.close();

		
		  FileReader reader=new FileReader("db.properties");
		  
		  Properties p=new Properties();
		  p.load(reader);
		 
		  System.out.println(p.getProperty("user"));
		  System.out.println(p.getProperty("password"));
		 
	}
}
