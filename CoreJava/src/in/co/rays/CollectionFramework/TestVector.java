package in.co.rays.CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector v= new Vector();
		
		v.add(100);
		v.add("one");
		v.add(true);
		v.add(false);
		
		System.out.println(v);
		
		Enumeration e= v.elements();
		
		v.add("NANDANI");
//after enum we can conti ading in vector or any method but in iterat we
//we cant..so benefit of enum..but in this we cant remove any likeadd
//	fail safe bol skte h..	jisme add ho skta after enum
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
}
