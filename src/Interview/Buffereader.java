package Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffereader {

	public static void main(String[] args) throws IOException {
		System.out.println("enter text");
		BufferedReader welcome = new BufferedReader(new InputStreamReader(System.in));
String data =welcome.readLine();
System.out.println("WELCOME" +" "+data);
	}

}
