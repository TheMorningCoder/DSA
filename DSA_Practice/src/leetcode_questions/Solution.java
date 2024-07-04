package leetcode_questions;


public class Solution {

	public static void main(String args[]) {
		int arr[]= {7,1,5,3,6,4};
		int arr2[]= {1,2,3,4,5};
		System.out.println(buySellStocks(arr));
		System.out.println(buySellStocks2(arr));
		System.out.println(buySellStocks(arr2));
		System.out.println(buySellStocks2(arr2));
	}

	public static int buySellStocks(int prices[]) {
		int minPrice=prices[0];
		int max=0;
		for(int i=0;i<prices.length;i++) {
			if(minPrice>prices[i]) {
				minPrice=prices[i];
			}else {
				max=Math.max(max, prices[i]-minPrice);
			}
		}
		
		return max;
	}
	public static int buySellStocks2(int prices[]) {
		int max=0;
		for(int i=0;i<prices.length-1;i++) {
			if(prices[i+1]>prices[i]) {
				max+=prices[i+1]-prices[i];
			}
		}
		
		return max;
	}
}
