package in.co.rays.cons;

public class TestShape {
	public static void main(String[] args) {
	 //Shape s1= new Shape();
	 Shape s2= new Shape("red", 20);
	 
	 System.out.println(s2.borderwidth()); 
	 System.out.println(s2.color());
	 
	 Rectangle1 r= new Rectangle1(10 ,10 );
	 r.area();
	 
	}

}
