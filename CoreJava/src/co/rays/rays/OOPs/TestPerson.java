package co.rays.rays.OOPs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
public static void main(String[] args) {
	SimpleDateFormat  sdf= new SimpleDateFormat("dd/mm/yyyy");
	
	Person p= new Person();
	
	p.setfirstName("abc");
	p.setlastName("xyz");
	p.setDob(new Date());
	
	System.out.println(p.getfirstName());
	System.out.println(p.getlastName());
	System.out.println(p.getDob());
	System.out.println(sdf.format(p.getDob()));
	System.out.println(p.AVG_AGE);
	
}
}
