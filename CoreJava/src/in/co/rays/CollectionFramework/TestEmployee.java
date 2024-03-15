package in.co.rays.CollectionFramework;

import java.util.ArrayList;
import java.util.List;


public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1= new Employee(1, "abc", 1000) ;
		Employee e2= new Employee(2,"pqr",2000);
		
        List list= new ArrayList();
        //listm trypecaste arraylist ko becoz 
        //list ko bnana h array list type
        
        list.add(1);
        list.add("xyz");
        list.add(e1);
        list.add(e2);
        
        System.out.println("List=>" + list);
        //System.out.println(e1);
	}

}
