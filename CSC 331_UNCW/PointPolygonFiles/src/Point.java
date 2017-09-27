
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double distance(Point other) {
		double xdiff = this.x - other.x;
		double ydiff = this.y - other.y;
		
		return Math.sqrt(xdiff*xdiff + ydiff*ydiff);
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public boolean equals(Object other) {
		if (other instanceof Point) {
			Point second = (Point ) other;
			return x==second.x && y==second.y;
		}
		else
			return false;
		
	}
}