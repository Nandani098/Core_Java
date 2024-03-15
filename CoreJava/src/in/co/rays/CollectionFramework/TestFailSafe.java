package in.co.rays.CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

import javax.lang.model.util.Elements;

public class TestFailSafe {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("one");
		v.add(100);
		v.add(false);
		v.add("abc");

		System.out.println(v);
		
		Enumeration e= v.elements();
		
		v.add("Nandani");
//failsafe no exception after method apply add..if exc eption so failfast
//which is occur in case of iterate.		
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
