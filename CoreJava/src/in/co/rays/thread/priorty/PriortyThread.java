package in.co.rays.thread.priorty;

public class PriortyThread extends Thread {
	
	String name= null;
	
	public PriortyThread(String name) {
		this.name= name;
	}

	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " = " + name);
		}
	}
}
