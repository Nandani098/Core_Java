package in.co.rays.oop;

public class Testshapejava {
public static void main(String[] args) {
	Shape s= new Shape();
	s.setcolor("red");
	s.setborderwidth(5);
	
	Rectangle r= new Rectangle();
	r.setcolor("blue");
	r.setborderwidth(10);
	r.setLength(20);
	r.setBreadth(30);
	r.area();
	
	Circle c= new Circle();
	c.setRadius(5);
	c.area();
	
	
	Triangle t = new Triangle();
	t.setBase(10);
	t.setHeight(5);
	t.area();
	
	System.out.println(s.getcolor());
	System.out.println(s.getBorderWidth());
	System.out.println(r.getLength());
	System.out.println(r.getBreadth());
	System.out.println(t.getBase());
	System.out.println(t.getHeight());
	
}	
}
