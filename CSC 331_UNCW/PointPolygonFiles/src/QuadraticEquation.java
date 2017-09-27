
/**
 * Write a description of class QuadraticEquation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuadraticEquation
{
	
	private int _a, _b, _c;

    public void setA(int value) {
        _a = value;
    }
    public void setB(int value) {
        _b = value;
    }
    public void setC(int value) {
        _c = value;
    }
    
    public double   getPositiveRoot() {
        double root = (-_b + Math.sqrt(_b*_b - 4*_a*_c))/(2*_a);
        return root;
    }
	
}
