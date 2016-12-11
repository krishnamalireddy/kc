package JAVAREGX;
/*
 * The Java Regex or Regular Expression is an API to define 
pattern for searching or manipulating strings.


It is widely used to define constraint on strings such as password and email validation. 
After learning java regex tutorial, you will be able to test your own regular expressions by the Java
 Regex Tester Tool.
 
  Java regex API consists of two core classes. These are: 
•The Pattern Class (java.util.regex.Pattern)
•The Matcher Class (java.util.regex.Matcher)

The Pattern class is used to create patterns (regular expressions). A pattern is precompiled regular expression in object form (as a Pattern instance), capable of matching itself against a text. 

The Matcher class is used to match a given regular expression (Pattern instance) against a text multiple times. In other words, to look for multiple occurrences of the regular expression in the text. The Matcher will tell you where in the text (character index) it found the occurrences. You can obtain a Matcher instance from a Pattern instance. 

From the Pattern instance a Matcher instance is obtained. Via this Matcher 
instance the example finds all occurrences of the regular expression in the text. 


The example does not actually check if the found http:// string is part of a valid URL, 
with domain name and suffix (.com, .net etc.). The regular expression just checks for an occurrence 
of the string http://. 

	
 */

import java.util.regex.*;

public class RegexExampleTest {
	public static void main(String args[]) {String text    =
	        "This is the text which is to be searched " +
	                "for occurrences of the word 'is'.";

	        String patternString = "is";

	        Pattern pattern = Pattern.compile(patternString);
	        Matcher matcher = pattern.matcher(text);

	        int count = 0;
	        while(matcher.find()) {
	            count++;
	// System.out.println("found: " + count + " : "+ matcher.start() + " - " + matcher.end());
	            
	            System.out.println("found: " + count + " : "+ matcher.start());
	        }
	        /*
	        String text1    =
	                "This is the text to be searched " +
	                "for occurrences of the http:// pattern.";

	        String pattern1 = ".*http://.*";

	        boolean matches = Pattern.matches(pattern1, text1);

	        System.out.println("matches = " + matches);*/

}
}
