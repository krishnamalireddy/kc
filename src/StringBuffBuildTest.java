
public class StringBuffBuildTest {
	
	
	public static void main(String args[])
	{
		/*StringBuilder and StringBuffer
		In the previous section, we saw how the exam might test your understanding of
		String immutability with code fragments like this:*/
		
		String x = "abc";
		String y=x.concat("def");
		
		System.out.println(x); 
		System.out.println(y); // output is "x = abc"
		/*Because no new assignment was made, the new String object created with the
		concat() method was abandoned instantly. We also saw examples like this:*/
		
		String xq = "abc";
		xq = xq.concat("def");
		System.out.println("x = " + x); // output is "x = abcdef"
		/*We got a nice new String out of the deal, but the downside is that the old String
		"abc" has been lost in the String pool, thus wasting memory. If we were using a
		StringBuffer instead of a String, the code would look like this:
		*/
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println("sb = " + sb); // output is "sb = abcdef"
		
	}

}
