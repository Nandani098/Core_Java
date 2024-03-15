package in.co.rays.ExceptionTest;

public class TestArithmaticException {
 public static void main(String[] args) {
	try {
	 int a = 10;
	 int b = 0;//2
	 int c= a/b;
	 
	 System.out.println(c);
	}
	catch(Exception e) {
		System.out.println(e);
	} 

 }
}
