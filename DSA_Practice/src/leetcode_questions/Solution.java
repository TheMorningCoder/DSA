package leetcode_questions;

import java.util.Arrays;

public class Solution {
	
	public static void main(String srgs[]) {
		int budget[]= {34,78 ,90, 15, 67};
		System.out.println(Arrays.toString(budget));
		System.out.println(maximumProfitApproach1(budget));
		System.out.println(maximumProfitBetterApproach(budget));
	}
	public static int maximumProfitBetterApproach(int budget[]) {
		Arrays.sort(budget);
		int maxProfit=0;
		for(int i=0;i<budget.length;i++){		
			maxProfit=Math.max(maxProfit, budget[i]*(budget.length-i));
		}
		return maxProfit;
	}

	public static int maximumProfitApproach1(int budget[]) {
		int maxProfit=0;
		for(int i=0;i<budget.length;i++){
			int profit=getMaxProfit(budget,budget[i]);
			maxProfit=Math.max(profit, maxProfit);
		}
		return maxProfit;
	}
	public static int getMaxProfit(int budget[],int num){
		int count=0;
		for(int i=0;i<budget.length;i++){
			if(budget[i]>=num) {
				count++;
//				System.out.println("Current value of loop = "+budget[i]+" count= "+count);
			}
				
		}
//		System.out.println("num= "+num+" count= "+count);
		return num*count;
	}
}


//public class Solution {
//
//	public static void main(String args[]) {
//		int arr[]= {7,1,5,3,6,4};
//		int arr2[]= {1,2,3,4,5};
//		System.out.println(buySellStocks(arr));
//		System.out.println(buySellStocks2(arr));
//		System.out.println(buySellStocks(arr2));
//		System.out.println(buySellStocks2(arr2));
//	}
//
//	public static int buySellStocks(int prices[]) {
//		int minPrice=prices[0];
//		int max=0;
//		for(int i=0;i<prices.length;i++) {
//			if(minPrice>prices[i]) {
//				minPrice=prices[i];
//			}else {
//				max=Math.max(max, prices[i]-minPrice);
//			}
//		}
//		
//		return max;
//	}
//	public static int buySellStocks2(int prices[]) {
//		int max=0;
//		for(int i=0;i<prices.length-1;i++) {
//			if(prices[i+1]>prices[i]) {
//				max+=prices[i+1]-prices[i];
//			}
//		}
//		
//		return max;
//	}
//}
