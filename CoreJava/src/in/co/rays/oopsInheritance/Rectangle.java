package in.co.rays.oopsInheritance;

public class Rectangle extends Shape {
	
   private int length;
   private int width;
   
   public int getLength() {
	   return length;
   }
   public void setLength(int length) {
	   this.length= length;  
   }
   public int getWidth(int width) {
	return width; 
   }
   public void setWidth(int Width) {
	   this.width= Width;
   }

   public void area() {
	   System.out.println("rectangle Area method..");
   }
}

