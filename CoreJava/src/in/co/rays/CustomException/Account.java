package in.co.rays.CustomException;

public class Account  {
 
	private int balance=0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposite(int amount) {
		int total = getBalance() + amount;
		setBalance(total);
		System.out.println("deposite balance =" +getBalance());
		
 }
// Checked exception( run time show kr dega exception either throw ya 
// try catch lgao mendatory jisse flow na ruke(daught flow throw p 
// throw krne p rukega ya nai sirf try c atch s hoga)
	public void withdrawl(int amount) throws InsufficientBalance {
		int total = getBalance() - amount;
		//setBalance(total);
		if (total<2000) {
			InsufficientBalance e = new InsufficientBalance();
			throw e;

		}else {
			setBalance(total);
			System.out.println("withdrawl balance="+getBalance());
		}
		
		//System.out.println("remaining balance=" +getBalance());
		
	}
}
