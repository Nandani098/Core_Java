package in.co.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {
	public static void main(String[] args) throws Exception {
	
FileReader file = new FileReader("C:\\Users\\BARFA\\OneDrive\\Desktop\\IO\\hello.txt");
Scanner sc = new Scanner(file);

while (sc.hasNext()) {//diff isme ye use ufhr =-1 n all check

	System.out.println(sc.nextLine());

}

file.close();
sc.close();
	}
	
	

}
