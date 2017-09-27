
public class Loan {
	private String book;
	private String patron;
	private String dueDate;
	
	public Loan(String book, String patron, String dueDate) {
		this.book = book;
		this.patron = patron;
		this.dueDate = dueDate;
	}
		
	public String getBook() {
		return book;
	}
	
	public String getPatron() {
		return patron;
	}
	
	public String getDueDate() {
		return dueDate;
	}
}
