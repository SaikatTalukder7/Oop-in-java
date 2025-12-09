package A8;

public class BankAccount {
	
	String accountNumber;
	double balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		if(balance >= 0) {
			this.balance = balance;
		}
		else {
			System.out.println("balance cannot be negative");
		}
	}
	
	void displayAccount() {
		
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
	

}
