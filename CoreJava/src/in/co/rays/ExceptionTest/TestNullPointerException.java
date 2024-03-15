package in.co.rays.ExceptionTest;

public class TestNullPointerException {
	public static void main(String[] args) {
		try {
		String name= null;
		System.out.println(name.length());
	}
		catch(Exception e) {
			System.out.println("e=" +e);
			System.out.println("Message= "+ e.getMessage());
			e.printStackTrace();
		}
}
}
