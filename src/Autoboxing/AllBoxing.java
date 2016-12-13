package Autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AllBoxing {
	
	public static void main(String args[]){  



List<Integer> ints = new ArrayList<Integer>();
ints.add(5);
ints.add(6);
//Returns integer at index 0
@SuppressWarnings("unused")
int iw = ints.get(0);

//As of JDK 1.5, it got better with Auto-boxing and genrics

 List<Integer> intsq = new ArrayList<Integer>();
intsq.add(5);
intsq.add(6);
//Returns integer at index 0
@SuppressWarnings("unused")
int ie = intsq.get(0);

 


	}

}
