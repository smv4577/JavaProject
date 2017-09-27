
public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(2,4);
		Point p2 = new Point(3,4);
		Point p3 = new Point(1,2);
		
		System.out.println(describePoint(p1));
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		System.out.println(p3);
	
		Polygon poly1 = new Polygon();
		poly1.add(p1);
		poly1.add(p2);
		poly1.add(p3);
		System.out.println("Vertices: " + poly1);
		System.out.println("Number of sides: " + poly1.getNumSides());
		System.out.println(p1.distance(p2)+ " "+ p2.distance(p3) + " "+ p3.distance(p1));
		System.out.println("Perimeter: " + poly1.getPerimeter());
	}
	private static String describePoint(Point p) {
		return "("+p.getX()+","+p.getY()+")";
		
	}

}
