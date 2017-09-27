import java.util.ArrayList;

public class Polygon {
	private int numSides = 0;
	private ArrayList<Point> data = new ArrayList<Point>();
	public Polygon(){
	
	}
	
	public void add(Point p1) {
		data.add(p1);
		numSides +=1;
		
	}
	
	public String toString() {
		if(data.size() > 2) {
			String result = "";
			for(int i = 0; i<data.size(); i++) {
				result += data.get(i);
			}
			return result + " ";
			}
		else
			return "Not enough sides";
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	public double getPerimeter() {
		double perimeter = 0;
		for(int i=0; i< data.size(); i++) {
			if(i < data.size()-1) {
				perimeter += data.get(i).distance(data.get(i+1));
			}
			else
				perimeter += data.get(i).distance(data.get(0));
		}return perimeter;
	}
	
	
}
