package A8;

public class Main {

	public static void main(String[] args) {

		BankAccount a1 = new BankAccount();
		a1.accountNumber = "A124";
		a1.balance = 5000;
		a1.displayAccount();
		
		BankAccount a2 = new BankAccount();
		a2.accountNumber = "A125";
		a2.setBalance(-5000);
		a2.displayAccount();


}

}
