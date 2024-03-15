package co.rays.rays.OOPs;

public class TestAccount {
public static void main(String[] args) {
	
	Account a= new Account();
	a.setaccountType("Saving");
	a.setbalance(8000);
	a.setname("Nandani");
	
	System.out.println(a.getAccountType());
	System.out.println(a.getbalance());
	System.out.println(a.getname());
	a.deposite();
	a.fundTransfer();
	a.payBill();
	}
}
