package in.co.rays.oopsInheritance;

public class TestSchool {
	public static void main(String[] args) {
		School s= new School();
		s.setBench(20);
		s.setDesk(2);
		s.setStudents(40);
		
		HighSchool h= new HighSchool();
		h.setBench(30);
		h.setClassTeacher("nandani");
		h.setDesk(2);
		h.setMonitor("vinay");
		h.setStudents(40);
		
		System.out.println(h.getBench());
		System.out.println(h.getClassTeacher());
		System.out.println(h.getDesk());
		System.out.println(h.getStudents());
		System.out.println(h.getMonitor());
		
		
		System.out.println(s.getBench());
		System.out.println(s.getDesk());
		System.out.println(s.getStudents());
		
	}
//typecasting remain
}
