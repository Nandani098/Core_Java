package in.co.rays.oop;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	public void setLength(int length) {
		this.length= length;
		
	}

	public int getLength() {;
	return length;
		
	}
	public void setBreadth(int Breadth) {
		this.breadth= Breadth;
	}
	public int getBreadth() {
		return breadth;
		
	}
	public void area() {
		int rarea= getLength()*getBreadth();
		System.out.println("Area of Rectangle= " +rarea);
	}
}


