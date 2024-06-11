package recursion;
import java.util.Scanner;
public class Print_1_to_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		print_count_ascending(num);

	}

	static void print_count_ascending(int number) {
		if(number==1) {
			System.out.println(number);
			return;	
		}
		else {
			print_count_ascending(number-1);
			System.out.println(number); 
		}
		
	}
	
}
