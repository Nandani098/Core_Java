package in.co.rays.oop;

public class Shape {
 
	private int borderwidth=0;
	private  String color= null;
	
	public void setborderwidth( int borderwidth) {
		this.borderwidth=borderwidth;
	}
	public  int getBorderWidth() {
		return borderwidth;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public String getcolor() {
		return color;
		
	}
}
