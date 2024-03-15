package in.com.rays;

public class MaxInArray {
	public static void main(String[] args) {
		int []a= {2,5,3,12,8};
		int b=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>b) {
				b=a[i];
			}
			
		}
		System.out.println(b);
	}

}
