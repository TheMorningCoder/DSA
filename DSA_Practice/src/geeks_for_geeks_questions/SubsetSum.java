package geeks_for_geeks_questions;

/*
Problem Statement:
Given an array of integers, generate all possible subset sums and print them in increasing order. 
A subset can include any combination of elements from the array, including the empty set.

Example:

Input: N = 3, arr[] = {5,2,1}
Output: 0,1,2,3,5,6,7,8

*/

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            SubsetSum ob = new SubsetSum();

            ArrayList<Integer> ans = ob.subsetSums(arr, N);
            Collections.sort(ans);
            for (int sum : ans) {
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
/*
We'll use a recursive approach to explore all possible subsets. 
At each step, for each element in the array, we have two choices:

Include the current element in the subset.
Exclude the current element from the subset.
 
*/

public class SubsetSum {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        int index=0;
        int currentSum=0;
        ArrayList<Integer> arrayOfSubsetSums=new ArrayList<Integer>();
        getSubsetArraysSums(arr,index,currentSum,arrayOfSubsetSums);
        Collections.sort(arrayOfSubsetSums);
        return arrayOfSubsetSums;
    }
    public void getSubsetArraysSums(ArrayList<Integer> arr, int index, int currentSum,ArrayList<Integer> arrayOfSubsetSums){
         
         if(index==arr.size()){
             arrayOfSubsetSums.add(currentSum);
             return;
         }
         
         //Exclude Case
         getSubsetArraysSums(arr,index+1,currentSum,arrayOfSubsetSums);
         
         //Include Case
         getSubsetArraysSums(arr,index+1,currentSum+arr.get(index),arrayOfSubsetSums);
            
    }
}
