package in.co.rays.Comperable;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private int salary;
	
	public Employee() {
	}

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		String str = id + " " + name + " " + salary;
		return str;
		
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return o.getId()- this.getId();//for desc
		//this.get-o.get //for ascen
		return this.getName().compareTo(o.getName());
	}

}
