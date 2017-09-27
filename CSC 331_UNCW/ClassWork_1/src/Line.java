
public class Line {
	private Point startPoint;
	private Point endPoint;
	
	public Line(Point p1, Point p2) {
		startPoint = p1;
		endPoint = p2;
	}
	
	public double length() {
		return startPoint.distance(endPoint);
	}
}
