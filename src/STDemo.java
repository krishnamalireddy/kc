import java.util.StringTokenizer;

class STDemo {
	static String in = "title=Java: The Complete Reference;" + "author=Naughton and Schildt;"
			+ "publisher=Osborne/McGraw-Hill;" + "copyright=1999";

	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer(in, "=;");
		while (st.hasMoreTokens()) {
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key + "\\t" + val);
		}
	}
}