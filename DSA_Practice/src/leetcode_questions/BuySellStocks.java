package leetcode_questions;

public class BuySellStocks {

	public static void main(String[] args) {
//		int prices[]= {7,1,5,3,6,4};
//		System.out.println(maxProfit(prices));
		int prices2[]= {7,2,5,3,6,4,1};
		System.out.println(maxProfit(prices2));
	}
	public static int maxProfit(int[] prices) {
	    if (prices == null || prices.length == 0) {
	        return 0;
	    }

	    int minPrice = prices[0];
	    int maxProfit = 0;

	    for (int i = 1; i < prices.length; i++) {
	        if (prices[i] < minPrice) {
	            minPrice = prices[i];
	            System.out.print("i= "+i+" minPrice= "+ minPrice);
	            System.out.println();
	        } else {
	        	System.out.print("i= "+i+" maxProfit= "+maxProfit+" prices[i]= "+prices[i]+" minPrice= "+ minPrice);
	        	System.out.println();
	            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
	            System.out.println("Updated maxProfit= "+ maxProfit);
	            
	        }
	    }

	    return maxProfit;
	}


}
