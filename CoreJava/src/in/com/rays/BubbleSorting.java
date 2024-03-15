package in.com.rays;

public class BubbleSorting {
	public static void main(String[] args) {
		int[]a= {2,6,3,9,5};
		int temp=0;
		for(int i=0;i<5;i++) {
		for(int j=i+1; j<5;j++) {
	if(a[i]<a[j]) {	// if(a[i]>a[j]) 
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
		}
		System.out.println(a[i]);
		}
	}

}
