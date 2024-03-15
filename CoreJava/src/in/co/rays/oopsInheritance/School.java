package in.co.rays.oopsInheritance;

public class School {
	private int desk=0;
	private int bench=0;
	private int Students=0;
	public int getDesk() {
		return desk;
	}
	public void setDesk(int i) {
		this.desk = i;
	}
	public int getBench() {
		return bench;
	}
	public void setBench(int bench) {
		this.bench = bench;
	}
	public int getStudents() {
		return Students;
	}
	public void setStudents(int students) {
		Students = students;
	}
	public void principle() {
		System.out.println("hello");
	}

}
