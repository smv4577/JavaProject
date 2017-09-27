//import java.util.ArrayList;

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(3, 4);
		Point p2 = new Point(3, 4);
		
		Point p3 = p1;
		
		System.out.println(describePoint(p1));
		System.out.println(describePoint(p2));
		
		System.out.println(p1.equals(p2));

	}

	private static String describePoint(Point p) {
		return "(" + p.getX() + "," + p.getY() + ")";
	}
}