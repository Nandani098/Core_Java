package co.rays.rays.OOPs;

public class TestLogics {
	public static void main(String[] args) {
		Logics l= new Logics();
		int a = l.sum(10,20);
		int b= l.sum(10 , 50);
		int c= a+b;
		System.out.println("sum =" +c);
		l.armstrong(123);
		
		l.pallindrome(121);
		
		int[]a1= {10,40,50,60,80,30,100};
		l.Secmax(a1);//daught return diya to idhr value pass to kese a1 daught
		System.out.println(l.Secmax(a1));
		
		l.Reverse(12345);//daught call nai horah
		
		
		
		
	}

	

}
