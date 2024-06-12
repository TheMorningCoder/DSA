package others;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator,int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public void simplify() {
		int gcd = 1;
		int smallerNumber=numerator<denominator?numerator:denominator;
		for (int i=2;i<=smallerNumber;i++) {
			if(numerator%i==0&&denominator%i==0) {
				gcd=i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		print();
	}
	
	public void print() {
		System.out.println("Fraction:"+numerator +"/"+ denominator);
	}
	
	public void add(Fraction f) {
		this.numerator=(this.numerator*f.denominator)+(f.numerator*this.denominator);
		this.denominator=this.denominator*f.denominator;
		simplify();
		
	}
	
	public void increment() {
		numerator=numerator+denominator;
		simplify();
		
	}

}
