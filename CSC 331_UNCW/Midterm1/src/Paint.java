/*
 * Sydney Vernatter
 */
public class Paint {
	private String name;
	private int red;
	private int green;
	private int blue;
	private double price;
	
	public Paint(String name, int red, int green, int blue, double price) {
		this.name = name;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRed() {
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Paint mix(Paint p) {
		String newName = this.name + p.name;
		int newRed = Math.round((this.red + p.red)/2);
		int newGreen = Math.round((this.green + p.green)/2);
		int newBlue = Math.round((this.blue + p.blue)/2);
		double newPrice = (this.price + p.price)/2;
		return new Paint(newName, newRed, newGreen, newBlue, newPrice);
	}
	
	public double distanceTo(Paint p) {
		int newRed = this.red - p.red;
		int newGreen = this.green - p.green;
		int newBlue = this.blue - p.blue;
		newRed *= newRed;
		newGreen*= newGreen;
		newBlue *= newBlue;
		return Math.sqrt(newRed + newGreen + newBlue);
	}
	
	public boolean equals(Paint p) {
		if ((p.getRed() == this.getRed()) && (p.getGreen() == this.getGreen()) && (p.getBlue() == this.getBlue()))
			return true;
		else return false;
	}

	// this is probably wrong 
	public double updatePrice(double price) {
		double oldPrice = this.getPrice();
		double newPrice = this.getPrice() + price;
		return newPrice;
	}
	
	public String toString() {
		return ("name = " + getName() + ", red = " + getRed() + ", green = " + getGreen() + ", blue = " + getBlue() + ", price = " + getPrice());
	}
}
