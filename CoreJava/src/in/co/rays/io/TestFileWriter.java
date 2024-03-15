package in.co.rays.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//in this we give mess here and print occur on doc we make

public class TestFileWriter {
	
public static void main(String[] args) throws IOException {
FileWriter file = new FileWriter("C:\\Users\\BARFA\\OneDrive\\Desktop\\IO\\Nandani.txt",true);
file.write("how are you");
file.write("fine");
//true use for not again again new file create ek hi m run ho
file.close();


	
}
}
