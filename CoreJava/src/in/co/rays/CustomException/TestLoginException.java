package in.co.rays.CustomException;

public class TestLoginException {//unchecked( run time p nai dega kuch 
//error ya exception to its on us ki try catch lgvana h ya nai
// if nai to flow ruk jayea prog ka)
 
 
	public static void main(String[] args) {
	  
		String login = "admi";
		System.out.println("Before");
try {
	if(login.equals("admin")) {
		System.out.println("Valid user id..");
	}else {
		LoginException e = new LoginException();
		throw e;
	}
}catch(Exception e) {
	System.out.println(e);
}
	System.out.println("After");	
		
	}
}
