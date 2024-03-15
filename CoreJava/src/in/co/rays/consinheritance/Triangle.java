package in.co.rays.consinheritance;

public class Triangle extends Shape{
	
	private int base=0;
	private int height=0;
	
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
 public void area() {
	 int tarea =1/2 * base*height;
	 System.out.println("Area of Triangle= "+tarea);
 }
}
