package in.com.rays;
public class SubstractSwitchCase {
public static void main(String[] args) {
	int Substract= 1;
	int a= 10;
	int b= 20;
	switch(Substract) {
	case 1:
		int c=a-b;
		System.out.println("subs =" +c);
		 break;
	case 2:
		int d=a/b;
	System.out.println("div =" +d);
	break;
	case 3:
		int e=a*b;
		System.out.println("multiply=" +e);
		break;
	case 4:
		int f=a+b;
		System.out.println("addition= "+f);
		break;
	default:
		System.out.println("Not Found");
		break;
		
			
	}
	}
}

