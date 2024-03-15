package in.co.rays.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args) throws Exception {
		
FileInputStream	file= new FileInputStream("C:\\Users\\BARFA\\OneDrive\\Desktop\\IO\\Barfa.txt");

ObjectInputStream in = new ObjectInputStream(file);//use for file create
//upp file used for path
 
Marksheet m = (Marksheet) in.readObject();//typecastebyte s obj m lane

System.out.println("id = " + m.id);
System.out.println("name = " + m.name);
System.out.println("physics = " + m.physics);
System.out.println("chemistry = " + m.chemistry);
System.out.println("maths = " + m.maths);
System.out.println("total = " + m.total);

in.close();
file.close();
	
	}
}
