package in.co.rays.Shallowclone;

public class TestShallowCloning {
	
   public static void main(String[] args) throws CloneNotSupportedException {
	   
	   Account a1 = new Account(100); 
	   Account a2 = (Account)a1.clone();//=a1 to a1 m bhi changes na ho 
	   
	  //for that we usee clone copy bna di account a1 ki
	   
	   a2.balance= 200;
	   
	   System.out.println(a1.balance);
	   System.out.println(a2.balance);
		   
		   
	   }
	
}

