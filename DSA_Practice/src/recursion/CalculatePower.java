package recursion;
import java.util.Scanner;
public class CalculatePower {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Calculate power of a number");
		System.out.println("Enter number");
		int x=sc.nextInt();
		System.out.println("Enter power");
		int n=sc.nextInt();
		int power=calc_pow(x,n);
		System.out.println(power);
	}
	static int calc_pow(int x,int n){
		int pow;
		if(n==0) {
			return 1;
		}
		else {
			return x * calc_pow(x,n-1);
		}
		
	}

}
