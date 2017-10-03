
public class Fraction {
	private int numerator;
	private int denominator;
	private String fraction;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}

	public Fraction(double decimal) {
		String s = String.valueOf(decimal);
		int digitsDec = s.length() - 1 - s.indexOf('.');        
		int denominator = 1;
		for(int i = 0; i < digitsDec; i++) {
			decimal *= 10;
			denominator *= 10;
		}
		int numerator = (int) Math.round(decimal);
		
		this.numerator = numerator; 
		this.denominator = denominator;
		simplify();
	}

	public int findGCD(int a, int b) {
		int temp;
		while(b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public void simplify() {
		int gcd = findGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
		if(denominator < 0) {
			numerator *= -1;
			denominator *= -1;
		}
	}

	public int getNum() {
		return numerator;
	}

	public int getDenom() {
		return denominator;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public double toDecimal() {
		return ((double) numerator) / denominator;
	}

	public Fraction add(Fraction fraction) {
		if (fraction.denominator != denominator) {
			int newDenominator = denominator * fraction.denominator;
			int newNumerator = fraction.numerator*denominator + fraction.denominator*numerator;
			return new Fraction(newNumerator, newDenominator);
		}
		else {
			int newNumerator = fraction.numerator + numerator;
			return new Fraction(newNumerator + fraction.numerator, denominator);
		}
	}

	public Fraction mult(Fraction fraction) {
		int newDenominator = denominator * fraction.denominator;
		int newNumerator = fraction.numerator * numerator;
		return new Fraction(newNumerator, newDenominator);
	}

	public Fraction sub(Fraction fraction) {
		if (fraction.denominator != denominator) {
			int newDenominator = denominator * fraction.denominator;
			int newNumerator = (numerator*fraction.denominator) - (denominator*fraction.numerator);
			return new Fraction(newNumerator, newDenominator);
		}
		else {
			int newNumerator = fraction.numerator - numerator;
			return new Fraction(newNumerator, denominator);
		}
	}

	public Fraction div(Fraction fraction) {
		Fraction newFraction = new Fraction(fraction.denominator, fraction.numerator);
		return this.mult(newFraction);
	}

	public int compareTo(Fraction fraction) {
		if (this.toDecimal() > fraction.toDecimal()) {
			return 1;
		}
		if (this.toDecimal() < fraction.toDecimal()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
