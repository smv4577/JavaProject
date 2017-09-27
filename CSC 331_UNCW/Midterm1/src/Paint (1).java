////Taylor Noble
//
//public class Paint {
//	private String name;
//	private double blue;
//	private double red;
//	private double green;
//	private double price;
//	public Paint(String name, double red, double green, double blue, double price) {
//		this.name = name;
//		this.blue = blue;
//		this.red = red;
//		this.green = green;
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Name = " + name + ",  red = " + red + ", green = " + green +", " + " blue = " + blue + ", price = " + price;
//	}
//	public boolean equals(Paint other) {
//		if (blue == other.blue  & red == other.red & green == other.green) {
//			return true;
//		}
//		else return false;
//	}
//	public Paint mix(Paint other) {
//		double new_red = (red + other.red)/2;
//		double new_green = (green + other.green)/2;
//		double new_blue = (blue + other.blue)/2;
//		String new_name = name + " " + other.name;
//		double new_price = (price + other.price)/2;
//		return new Paint(new_name,new_red,new_green,new_blue,new_price);
//	}
//	public double distanceTo(Paint other) {
//		double r_diff = Math.pow(red - other.red,2);
//		double g_diff = Math.pow(green - other.green,2);
//		double b_diff = Math.pow(blue - other.blue,2);
//		return Math.sqrt(r_diff + g_diff + b_diff);
//		
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void updatePrice(double price) {
//		this.price = price;
//	}
//	
//}
