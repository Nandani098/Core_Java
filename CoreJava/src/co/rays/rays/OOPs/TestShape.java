package co.rays.rays.OOPs;

public class TestShape {

	public static void main(String[] args) {
		Shape s= new Shape();
		
		s.setborderWidth(100);
        s.setColor("blue");
        
        System.out.println(s.getBorderwidth());
        System.out.println(s.getColor());
	}
}
