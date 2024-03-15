package in.com.rays;

public class TestPallindrome {
public static void main(String[] args) {
	 int a=151;
	 int b=a;
			 
	 int c=0;
	 int d;
	 
	 while(b>0) {
		 d=b%10;
		 c= c*10+d;
		 b= b/10;
	 }
	 if(c==a) {
		 
		 System.out.println("yes,it is pallindrome number");
	 }else {
		 System.out.println("No,it is not pallindrome number");
	 }
}
}
