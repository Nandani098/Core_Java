package co.rays.rays.OOPs;

public class Automobile {
private String color=null;
private int speed= 0;
private String make= null;

public static final int NO_OF_GEARS= 6;

public void setColor(String color) {
	this.color= color;
}
public String getColor() {
return color;
}
public void setSpeed(int Speed) {
	this.speed= Speed;
}
public int getSpeed() {
	return speed;
}
public void setMake(String make) {
	this.make= make;
}
public String getMake() {
	return color;
}
public void speedBreak() {
	System.out.println("Dont change the speed too frequently");
}
public void changeGear() {
	System.out.println("please change gear");
	}
public void accelerator() {
	System.out.println("Don't move your legs from Accelerator"); 
}
}
