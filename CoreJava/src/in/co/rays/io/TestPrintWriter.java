package in.co.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {
	public static void main(String[] args) throws IOException {
		
	FileWriter file = new FileWriter("C:\\Users\\BARFA\\OneDrive\\Desktop\\IO\\hello.txt");
	PrintWriter out = new PrintWriter(file);

//yaha meses denge udhr print hoga
//	and here we create by name direct docu hello jo udhr bn jayega apneap
//	n usme ky print krvana vo krva do 
	
	out.print("Hello");
	out.print(" ");
	out.print("Nandani");
	
	out.close();
	file.close();
	}

}
