package in.co.rays.ExceptionTest;

public class TestArrayIndexException {
	public static void main(String[] args) {
		try {
		int []arr = {1,2,3,4,5};
		System.out.println(arr[10]);//4
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
