package in.co.rays.constructor;

public class TestShape {
	
	public static void main(String[] args) {
		  //Shape s= new Shape();
		  Shape s1= new Shape(10, "red");
		  
		 // s1.setBorderWidth(10);
		 // s1.setColor("red");
		  
		  System.out.println(s1.getBorderWidth());
		  System.out.println(s1.getColor());
		 
		  Shape s2= new Shape(10, "red");
		 
		  System.out.println(s2.getColor());
		  s2.setColor("green");
		  
		  System.out.println(s2.getBorderWidth());
		  System.out.println(s2.getColor());
		
	}

}
