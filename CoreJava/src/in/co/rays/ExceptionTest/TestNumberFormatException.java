package in.co.rays.ExceptionTest;

public class TestNumberFormatException {
 public static void main(String[] args) {
	try {
	 String str= "12e";
	 int number= Integer.parseInt(str);
	 System.out.println(number);
}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
