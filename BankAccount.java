
public class BankAccount {
	//Properties
		private double balance; //instance variable
		private double interestRate;
		private String accountNumber;
		private static int counter = 1;
		private BankAccount overdraftAccount = null;
		private int overdraftFee = 50;
		
		//classwork
		private Customer theOwner = null;
		
		public BankAccount(double balance) {
			this.balance = balance;
			this.accountNumber = "b" + counter;
			counter++;
		}
		
		public BankAccount(double balance, double intRate) {
			this(balance);
			interestRate = intRate;
		}
		
		//Behavior modeled as methods
		
		public String getAccountNumber(){
			return accountNumber;
		}
				
		public double getBalance() {
			return balance;
		}
		
		public void deposit(double amount){
			balance += amount;
		}
		
		public void withdraw(double amount){
			balance -= amount;
			while (balance < 0) {
				overdraftAccount.transfer(overdraftFee, this);
			}
		}
		
		public void transfer(double amount, BankAccount other) {
			this.withdraw(amount);
			other.deposit(amount);
		}
		
		public void setOverdraftAccount(BankAccount b) {
			overdraftAccount = b;
		}
		
		//classwork 
		public void setOwner(Customer c) {
			theOwner = c;
			c.addAccount(this);
		}
		
}
