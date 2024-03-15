package in.co.rays.cons;

public class Rectangle1 extends Shape {
	private int length;
	private int breadth;
	
	public Rectangle1 (int length , int breadth) {
		this.breadth = breadth;
		this.length = length;
	}
	public int length() {
		return breadth;
		}
  public int breadth() {
	return breadth;
	  
  }
  public void area() {
	  int rarea = length()*breadth();
	  System.out.println(" area of rectangle=" +rarea);
  }
}
