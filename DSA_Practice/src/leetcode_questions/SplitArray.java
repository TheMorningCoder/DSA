package leetcode_questions;

public class SplitArray {

	public static void main(String[] args) {
		int arr[]= {1,4,3};
		
	}
	public static boolean splitArray(int input[]) {
		int sum3=0;
		int sum5=0;
		int remainingSum=0;
		
		for(int n:input) {
			if(n%5==0) {
				sum5+=n;
			}
			else if(n%3==0) {
				sum3+=n;
			}
			else {
				remainingSum+=n;
			}
		}
		int totalSum=sum3+sum5+remainingSum;
		if(totalSum%2!=0)
			return false;
		
        // Check if the difference can be balanced with remaining elements
        int diff = Math.abs(sum5 - sum3);
        return remainingSum >= diff;
		
	}

}
