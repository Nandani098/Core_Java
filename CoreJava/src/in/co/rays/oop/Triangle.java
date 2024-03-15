package in.co.rays.oop;

public class Triangle  extends Shape{
	
private int base;
private int height;
//double half =0.5;

public void setBase(int base) {
this.base = base;
}

public int getBase() {
	return base;
}

public void setHeight(int height) {
	this.height= height;
}
public int getHeight() {
	return height;
}
 public void area () {
	 double tarea= 0.5 * getBase()* getHeight();//(at the place of 0.5 put half)
	 System.out.println(" Area of Triangle=" +tarea);
	 

	
}	
	}


