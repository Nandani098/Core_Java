package in.co.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFileReader{
	
	public static void main(String[] args) throws Exception {
		
FileReader file = new FileReader("C:\\Users\\BARFA\\OneDrive\\Desktop\\IO\\Nandani.txt");
		
 int ch= file.read();
 //value hold asky valuye int m read krke asky m hold
 //then..
 // System.out.print(ch);m one h ki asky value ayegi bs..for all we have to apply while 
 //loop then char m typecasdte krvana o/p k liye
  while(ch!= -1) {
	  System.out.print((char)ch);
	  
	  ch=file.read();
  }
	}
}
