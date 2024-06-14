package recursion;

public class Sum_Of_N_Numbers {

	public static void main(String[] args) {
	int n=1;
	System.out.println(sum(n));

	}
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}

}
