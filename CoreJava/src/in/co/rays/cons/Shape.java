package in.co.rays.cons;

public class Shape {
	private String color;
	private int borderwidth;
	
	
	public Shape() {
		System.out.println("Default");
		}
	public Shape (String color , int borderwidth) {
		this.borderwidth = borderwidth;
		this.color = color;
		
	}
	public String color() {
		return color;
		}
	
	public int borderwidth() {
		return borderwidth;
		
	}
	
	
}