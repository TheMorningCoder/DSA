package recursion;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many numbers do you want to print in Fibonacci series:");
		int limit=sc.nextInt();
		fib(limit);
	}
	static void fib(int n) {
		if(n==1||n==2) {
			System.out.println("1");
			return;
		}
		else {
			
		}
	}

}
