package in.co.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {
	
public static void main(String[] args) {
File f= new File("C:\\Users\\BARFA\\OneDrive\\Desktop\\IO\\hyy.txt");
//instead of hy u can use hello but when u use byy file not exist//

if(f.exists()) {
System.out.println("Name:" +f.getName());
System.out.println("Path:" + f.getAbsolutePath());

System.out.println("Access permission");
System.out.println("Writable:" + f.canWrite());
System.out.println("Readable:" + f.canRead());

System.out.println("Is File:" + f.isFile());
System.out.println("Is Dir:" + f.isDirectory());

Date d= new Date(f.lastModified());
System.out.println("Date Modified:" + d);

long length= f.length();
System.out.println("Length:" + length + " bytes");
}
else {
System.out.println("File does not exist");

}
	
}	

}
