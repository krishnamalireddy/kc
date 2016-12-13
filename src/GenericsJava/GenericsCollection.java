package GenericsJava;

import java.util.ArrayList;
import java.util.List;

//They allow "a type or method to operate on objects of various types while providing compile-time 
//type safety." 
//This feature specifies the type of objects stored in a Java Collection.
//
//
//

public class GenericsCollection {
	public static void main(String[] args) {  
	
	List<Object> list = new ArrayList<Object>();

	list.add(new Integer(2));
	list.add("a String");
	
	Integer bbb = (Integer) list.get(0);

	String kkkk   = (String) list.get(1);
	
	//Java 1.55

	List<String> strings = new ArrayList<String>();

	strings.add("a String");

	

	String aString = strings.get(0);

	
	}

}
