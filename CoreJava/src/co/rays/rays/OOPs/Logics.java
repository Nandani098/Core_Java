package co.rays.rays.OOPs;

public class Logics {
	public int sum(int a , int b) {
		int c= a+b;
		return c;
	}
	
	//[1]:
	
	public void armstrong (int number) { 
		int n = number;
		int sum= 0;
		int r= 0;
		
		while(n>0) {
			r= n% 10;
			sum= sum+(r*r*r);
			n= n/10;	
		}
		if (sum==number) {
			System.out.println("Number Is Armstrong no");
		}else {
			System.out.println("Number Is Not Armstrong no");
		}
	}
	
   //[2]:
	
	public void pallindrome( int number) 
	//public static void main(String[] args) {
		//int number= 212
		//}
	{
		int sum= 0;
		int r= 0;
		int n = number;
		
		while(n>0) {
			r= n% 10;
			sum= sum*10+r;
			n= n/10;
		}	
		if(sum==number)	{
			System.out.println("No. is pallindrome");
		}
		else {
			System.out.println("No is not pallindrome");
		}
		
	}
	
	//[3]:
	
	public int Secmax(int []a) {//(idhr return krva kr method call krke udhr value pass )
	int min=0;
	int max=0;
	for (int i = 0; i <a.length; i++) {
		if(a[i]>max) {
			min =max;
			max= a[i];
		
		}
		if(a[i]>min && a[i]<max) {
			min=a[i];
			
		}
	}
	return min;
}
	
	//[4];
	
	public void Reverse(int number) {
	int sum= 0;
	int r= 0;
	int n = number;
	
	while(n>0) {
		r= n% 10;
		sum= sum*10+r;
		n= n/10;
	}	
	
	System.out.println( );
}

}








