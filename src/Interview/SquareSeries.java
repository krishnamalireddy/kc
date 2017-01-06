
package Interview;
import java.io.*;

class SquareSeries
{
    public static void main(String args[]) throws IOException
    {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no.of elements in series: ");
        n = Integer.parseInt(br.readLine());

        if(n>0)
        {
            System.out.println("Series:");
            for(int i=0; i<(n); i++)
            {
                System.out.println("\t"+(int)(Math.pow(i,2)));
            }
        }

    }
}
