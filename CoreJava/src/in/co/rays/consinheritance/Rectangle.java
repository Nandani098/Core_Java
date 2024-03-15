package in.co.rays.consinheritance;

public class Rectangle extends Shape {
	
	private int length= 0;
	private int width =0;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void area() {
		int rarea= length*width;
		System.out.println("Area of Reactangler" + rarea);
	}
}
