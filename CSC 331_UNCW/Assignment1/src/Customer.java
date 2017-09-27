
public class Customer {
	private String name;
	private String Id;
	private BankAccount b;
	private static int counter = 1;
	
	public Customer(String name) {
		this.name = name;
		this.Id = "c" + counter;
		counter++;
	}
	
	public String getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccount(BankAccount b) {
		this.b = b;
	}
	
	public double getAssetTotal() {
		return b.getBalance();
	}
}

