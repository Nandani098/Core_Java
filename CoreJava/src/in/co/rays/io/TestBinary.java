package in.co.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {
	public static void main(String[] args) throws Exception {

FileInputStream in = new FileInputStream("C:\\Users\\BARFA\\OneDrive\\Desktop\\customlogo.jpg");
FileOutputStream out = new FileOutputStream("C:\\Users\\BARFA\\OneDrive\\Desktop\\IO\\rays.jpg");

int ch = in.read();

while (ch != -1) {

	out.write(ch);

	ch = in.read();

}

out.close();
in.close();

	}		
}
