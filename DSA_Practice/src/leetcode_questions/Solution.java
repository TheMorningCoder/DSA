package leetcode_questions;



public class Solution {

	public static void main(String args[]) {
		int arr[]= {7,1,2,3,4,5,1};
		System.out.println(buySell(arr));
	}
	public static int buySell(int arr[]) {
		int minPrice=arr[0];
		int maxProfit=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minPrice)
				minPrice=arr[i];
			else {
				if(maxProfit<(arr[i]-minPrice)) {
					maxProfit=(arr[i]-minPrice);
				}
				
			}
		}
		
		return maxProfit;
	}
	
}