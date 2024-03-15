package in.com.rays;

public class TestArmstrong {
public static void main(String[] args) {
	int number=152;//153;
	int n= number;
	int sum=0;
	int r;
	while(n>0) {
		r=n%10;
		sum=sum+ (r*r*r);
		n=n/10;	
	}
	if(sum == number) {
		System.out.println(" yes,It's an Armstrong Number");
	}
		else {
			System.out.println(" No , It's Not an Armstrong Number");
	}
}
}
