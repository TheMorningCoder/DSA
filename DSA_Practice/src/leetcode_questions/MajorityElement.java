package leetcode_questions;

import java.util.HashMap;
import java.util.Map;
public class MajorityElement {
	public static void main(String args[]) {
		int arr[]= {2,3,2,3,2,2,2,4,4,4,2,2};
		for(int x: arr)
			System.out.print(x+" ");
		System.out.println();
		System.out.println(majorityElement(arr));
	}
	public static int majorityElement(int nums[]) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int num:nums) {
			
// The HashMap.getOrDefault(Object key, V defaultValue) method in Java is a useful method that helps you retrieve the value associated with a given key in a HashMap. If the key does not exist in the map, it returns a specified default value instead of null.
			int numIsPresent=map.getOrDefault(num,0);
			
//The HashMap.put(key, value) method in Java is used to insert a key-value pair into a HashMap. If the key is not already present in the HashMap, the method inserts the new key-value pair into the map. If the key is already present in the HashMap, the method updates the value associated with that key to the new value.
			map.put(num, numIsPresent+1); 
			
//If the specified key is present in the HashMap, the HashMap.get(Object key) returns the value associated with that key. If the specified key is not present in the HashMap, the method returns null
			if(map.get(num)>nums.length/2)
				return num;
		}
		
		return -1;
		
	}
}
