
public class TestAccount {
	public static void main(String[] args) {
		BankAccount aparna = new BankAccount("aparna D", 1234, "bangalore", 200);
		BankAccount sandhya=new BankAccount("sandhya",6666,"ooty",200);
		aparna.deposit(400);
		double x = aparna.getBalance();
		System.out.println(x);
		aparna.withdraw(280);
		x = aparna.getBalance();
		System.out.println(x);
		aparna.deposit(200);
		x = aparna.getBalance();
		System.out.println(x);
		sandhya.withdraw(1600);
		double y=sandhya.getBalance();
		System.out.println(y);
		 
	}
}