package Interview;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
	System.out.println("enter name:");
	Scanner scan = new Scanner (System.in);
	String data = scan.nextLine();
	
	System.out.println("Welcome" +" "+data+" " + "sir");
	}

}
