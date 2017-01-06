package Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CubeSeries {

	public static void main(String[] args) throws NumberFormatException, IOException {
	    int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no.of elements in series: ");
        n = Integer.parseInt(br.readLine());
 
        if(n>0)
        {
            System.out.println("Series:");
            for(int i=0; i<n; i++)
            {
                System.out.println("\t"+(int)(Math.pow(i,3)));  //Pattern for elements
            }
        }
	}

}
