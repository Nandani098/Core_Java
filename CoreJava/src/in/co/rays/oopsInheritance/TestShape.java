package in.co.rays.oopsInheritance;

public class TestShape {
public static void main(String[] args) {
	
	Shape s1= new Shape();
	s1.area();
	s1.area();
	s1.getBorderWidth();
    s1.getColor();
    
    Rectangle r1= new Rectangle();
    r1.area();
    r1.area();
    r1.getBorderWidth();
    r1.getWidth(0);
    r1.getLength();
    r1.getColor();
    
    Shape shape = new Rectangle();
    shape.area();
    shape.getColor();
    
    //Rectangle rectangle= (Rectangle) shape;    
}
}
