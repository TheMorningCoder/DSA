package recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers do you want to print in Fibonacci series:");
		int limit = sc.nextInt();
		// Print the first N numbers
		
		for (int i = 0; i < limit; i++) {
			//System.out.print(i);
			System.out.print(fib(i) + " ");
		}
	}

	static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

}
