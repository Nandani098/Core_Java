package co.rays.rays.OOPs;

import java.util.Date;

public class Person {
private String firstName=null;
private String lastName =null;
private Date dob = null;
public static final int AVG_AGE=18;
 
public String getfirstName() {
	return firstName;
}
public void setfirstName(String firstName) {
	this.firstName=firstName;
}
public String getlastName() {
	return firstName;
}
public void setlastName(String lastName) {
	this.lastName= lastName;	
}
public Date getDob() {
	return dob;	
}
public void setDob(Date dob) {
	this.dob= dob;
}	
}
