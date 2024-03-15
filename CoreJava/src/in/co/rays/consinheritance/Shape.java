package in.co.rays.consinheritance;

public class Shape {
	private int borderWidth=0;
	private String color=null;
	
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void area() {
		System.out.println("shape area method");
	}
}
