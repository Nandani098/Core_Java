package in.co.rays.CollectionFramework;

public class Employee {

	private int id;
	private String name;
	private int sallery;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int sallery) {
		this.id=id;
		this.name= name;
		this.sallery = sallery;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSallery() {
		return sallery;
	}

	public void setSallery(int sallery) {
		this.sallery = sallery;
	}
	
	@Override
	public String toString() {
		String str = id+" "+name+" "+sallery;
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		Employee e = (Employee)obj;
		boolean eq = this.id==e.id && this.name==e.name && this.sallery==e.sallery;
		return eq;
	}
	
	@Override
	public int hashCode() {
		System.out.println("in hashcode");
		String str= id + name+ sallery;
		return str.hashCode();
	}
	
	}
	
