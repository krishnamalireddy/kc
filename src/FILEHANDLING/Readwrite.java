package FILEHANDLING;

import java.io.*;

class Readwrite {
	public static void main(String args[]) throws Exception {
		FileInputStream fin = new FileInputStream("kkk.txt");
		FileOutputStream fout = new FileOutputStream("pqr.txt");
		int i = 0;
		while ((i = fin.read()) != -1) {
			fout.write(i);
			
			
		}
		fin.close();
		
		fout.close();
		
	
		
		System.out.println("dasdasd");
	}
}
