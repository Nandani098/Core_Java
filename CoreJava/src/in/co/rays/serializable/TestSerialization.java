package in.co.rays.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	
	public static void main(String[] args) throws Exception {
	
FileOutputStream file = new FileOutputStream("C:\\Users\\BARFA\\OneDrive\\Desktop\\IO\\Barfa.txt");
	
ObjectOutputStream out = new ObjectOutputStream(file);

Marksheet m = new Marksheet();
m.id = 10;
m.name = "yash";
m.physics = 89;
m.chemistry = 99;
m.maths = 81;
m.total = m.physics + m.chemistry + m.maths;

out.writeObject(m);

out.close();
file.close();

System.out.println("Object write successfully....!!!");
System.out.println("total = " + m.total);

	}

}