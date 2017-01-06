package Interview;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Series {
	public static void main(String[] args) throws IOException {
		int n = 10;
		int k = 1;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("enter limit:");
		n = Integer.parseInt(sc.readLine());
		System.out.print(1 + ",");
		for (int i = 1; i < n; i++) {
		k = k + (i * i);
		if (i % 2 == 0) {
		System.out.print(k + ",");
		} else {
		System.out.print(-k + ",");
		}
		}

		}

}
