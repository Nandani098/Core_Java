package in.co.rays.constructor;

public class Shape{//(constructor+getter,setter)

private int borderWidth=0;
private String color=null;

public Shape() {
	System.out.println("default constructor" );
}
public Shape(int borderWidth) {
	this.borderWidth=borderWidth;
}
public Shape(int borderWidth,String color) {
	this.color=color;
	this.borderWidth=borderWidth;
}
public void setBorderWidth(int borderWidth) {
 this.borderWidth= borderWidth;	
}
public int getBorderWidth() {
	return borderWidth;	
}
public void setColor(String color) {
	this.color= color;
}
public String getColor() {
	return color;
}	
}
//constructor is much better then getter setter..
//but if variables are private so we have to create getter setter