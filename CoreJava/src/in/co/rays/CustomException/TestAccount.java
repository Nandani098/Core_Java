package in.co.rays.CustomException;

public class TestAccount {
	public static void main(String[] args) {
		Account a= new Account();
		a.setBalance(10000);
		a.deposite(5000);
		
		try {
			a.withdrawl(13001);//if 12000 so withdraw handle but 2000 s less to handle kiya taki 
			//execution na ruke
		} catch (InsufficientBalance e) {
			System.out.println(e);
		}
		System.out.println("after="+ a.getBalance());
		
		//a.getBalance();	
		
	}

}
