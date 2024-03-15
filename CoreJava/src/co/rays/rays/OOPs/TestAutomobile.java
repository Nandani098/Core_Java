package co.rays.rays.OOPs;

public class TestAutomobile {
public static void main(String[] args) {
Automobile a= new Automobile();
a.setColor("Blue");
a.setMake("fORD");
a.setSpeed(120);
a.accelerator();
a.changeGear();
a.speedBreak();

System.out.println(a.getColor());
System.out.println(a.getMake());
System.out.println(a.getSpeed());
System.out.println(a.NO_OF_GEARS);
}
}
