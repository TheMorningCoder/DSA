/*Given an array of integers citations where citations[i] is the number of citations a researcher received for 
 their ith paper, return the researcher's h-index.
 Input: citations = [3,0,6,1,5]
 Output: 3
 Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations 
 respectively.
 Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, 
 their h-index is 3.
*/

package leetcode_questions;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		int arr[]= {3,1,0,6,5};		
		System.out.println(findHIndex(arr));
		int arr2[]= {11,15};		
		System.out.println(findHIndex(arr2));
		int arr3[]= {0};		
		System.out.println(findHIndex(arr3));
		int arr4[]= {1};		
		System.out.println(findHIndex(arr4));
		int arr5[]= {4};		
		System.out.println(findHIndex(arr5));
	}
	public static int findHIndex(int[]citations) {
		int hIndex=0,h=0,n;
		n=citations.length;
		Arrays.sort(citations);
		for(int i=0;i<n;i++) {
			h=n-i;
			if(citations[i]>=h) {
				hIndex=h;
				break;
			}
		}
		return hIndex;
	}

}
