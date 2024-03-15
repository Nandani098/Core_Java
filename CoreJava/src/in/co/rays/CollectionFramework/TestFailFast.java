package in.co.rays.CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class TestFailFast {
	public static void main(String[] args) {
	Vector v= new Vector();
	
	v.add(100);
	v.add("one");
	v.add(true);
	
	Iterator it = v.iterator();
	
	v.add(false);//after adding there is exception..means failfast
//means iterate m add nai after applying method
//if there is enum so we can add after eplyimg method
//we can take at the polace of v list also..but frk pdega to method s 
//iterate..ya enum s	
	
	
	while (it.hasNext()) {

		System.out.println(it.next());

	}
	
	}	

}
