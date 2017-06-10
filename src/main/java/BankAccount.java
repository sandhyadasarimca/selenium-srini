
public class BankAccount {
	private String name;
	private double accountNumber;
	private String address;
	private double balance;

	public BankAccount(String name, int accountNumber, String address, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.address = address;
		this.balance = balance;

	}

	public void withdraw(double amount) {
		if (balance - amount >= 300) {
			balance = balance - amount;
		} else {
			System.out.println("have min bal 300");
		}
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public double getBalance() {
		return balance;
	}
}
