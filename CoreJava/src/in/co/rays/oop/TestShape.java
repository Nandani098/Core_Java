package in.co.rays.oop;

public class TestShape {
 public static void main(String[] args) {
	 Shape s= new Shape();
	 s.setborderwidth(2);
	 s.setcolor("yellow");
	 
	 System.out.println(s.getBorderWidth());
	 System.out.println(s.getcolor());
	 }
}
