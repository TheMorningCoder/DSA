package others;

public class ComplexNumber {
	int real;
	int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void print() {
		
	}
	
	public void add(ComplexNumber c) {
		
	}
	
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int newReal, newImaginary;
		newReal=c1.real+c2.real;
		newImaginary=c1.imaginary+c2.imaginary;
		ComplexNumber c3=new ComplexNumber(newReal,newImaginary);
		return c3;
	}
}


