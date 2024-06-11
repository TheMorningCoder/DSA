package recursion;
 import java.util.Scanner;
public class Calc_Number_Of_Digits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Number of digits in "+ num+ " are: "+ num_of_digits(num));
	}
	
	static int num_of_digits(int number) {
		if(number<10) {
			return 1;
		}
		else {
			return 1 + num_of_digits(number/10);
		}
	}
}
