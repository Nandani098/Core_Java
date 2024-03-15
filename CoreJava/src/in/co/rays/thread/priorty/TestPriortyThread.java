package in.co.rays.thread.priorty;

public class TestPriortyThread {
public static void main(String[] args) {
	
	PriortyThread t1= new PriortyThread("Nandani");
	PriortyThread t2 = new PriortyThread("Barfa");
	
	t1.setPriority(2);
	t2.setPriority(8);
	

	t1.start();
	t2.start();
}
}
