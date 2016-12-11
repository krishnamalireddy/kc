package Properties;

import java.util.*;
import java.io.*;
/* System.getProperties() method
 *  we can get all the properties of system. Let's create the class that gets information from the system properties*/

/*
 * System
The System class holds a collection of static methods and variables. The standard input,
output, and error output of the Java run time are stored in the in, out, and err variables.
the Java environment relies on several built-in class libraries that contain many
built-in methods that provide support for such things as I/O, string handling, networking,
and graphics.	
 */

public class TestSystemProperties {
	public static void main(String[] args) throws Exception {

		Properties p = System.getProperties();
		
		
		Set set = p.entrySet();

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}
}
