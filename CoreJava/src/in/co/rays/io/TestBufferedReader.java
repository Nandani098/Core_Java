package in.co.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestBufferedReader {
	
	public static void main(String[] args) throws Exception {
		
FileReader file = new FileReader("C:\\Users\\BARFA\\OneDrive\\Desktop\\IO\\Nandani.txt");

BufferedReader in = new BufferedReader(file);

//asky value readerfile m to int m hold then char m typecaste
//yaha string m derah buufer red..to udhr hold typecast yaha 
//direct

 String line = in.readLine();//for oneline but many line so use while loop
  
 while(line!= null) {
	  System.out.println(line);
	  line= in.readLine();
  
	  
  }

 in.close();
 file.close();
}
}
