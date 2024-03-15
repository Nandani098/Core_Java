package in.com.rays;

public class SecondMaxInArray {
public static void main(String[] args) {
	int[]a= {2,6,98,45,3};//48
	int secmax=0;
	int max=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max) {
			secmax =max;
			max= a[i];
		}
		if(a[i]>secmax && a[i]<max) {
			secmax=a[i];
			
		}
	}
		System.out.println(secmax);
	}
}
