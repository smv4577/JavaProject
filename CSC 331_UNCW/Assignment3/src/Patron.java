
public class Patron {
	private String name;
	private String patronId;
	private static int counter = 1;
	
	public Patron(String patronId, String name) {
		this.patronId = patronId;
		this.name = name;
		counter++;
		this.counter();
	}
	
	public Patron(String name) {
		patronId = "P" + counter;
		counter++;
		this.name = name;
	}
	
	private void counter() {
		String[] parts = patronId.split("P");
		String id = parts[1];
		int id2 = parseInt(id);
		if (id2 >= counter) {
			counter = id2 + 1;
		}
	}

	private int parseInt(String id) {
		// TODO Auto-generated method stub
		return 0;	
	}
	
	public String getPatronId() {	// Gets patron id
		return patronId;
	}
	
	public String getName() {	// Gets name of patron
		return name;
	}
	
	public String toString() {	// Overrides original toString method
        return ("Patron ID: " + this.getPatronId() + ", Name: " + this.getName());
   }
}
