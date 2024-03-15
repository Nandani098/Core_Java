package co.rays.rays.OOPs;

public class Account {

	private String name=null;
	private String accountType= null;
	private double balance=0;
	
	public void setname(String name) {
		this.name = name;
	}
	public  String getname() {
		return name;
	}
	public void setaccountType(String at) {
		this.accountType= at;
	}
	public String getAccountType() {
		return accountType;		
	}
	public void setbalance(double balance) {
		this.balance= balance;	
	}
	public double getbalance() {
		return balance;	
	}
	public void	deposite() {
	System.out.println("your fee is not submitted");
	}
	public void withdrawal() {
		System.out.println(" yoh have withdraw 200 rupee");	
	}
	public void fundTransfer() {
		System.out.println("1000 transaction to Nandani");
	}
	public void payBill() {
		System.out.println("please pay your electricity bill");
	}
}
