package linked_list;

import java.util.ArrayList;

class RemoveConsecutiveDupesFromArrayList {

    public static ArrayList<Integer> removeDupes(ArrayList<Integer> arr) {
    	
    	ArrayList<Integer> newArr=new ArrayList<>();
    	newArr.add(arr.get(0));
    	for(int i=1;i<arr.size();i++) {
    		if(arr.get(i)!=arr.get(i-1)) {
    			newArr.add(arr.get(i));
    		}
    	}
    	
    	return newArr;
    }
	
    public static void main(String args[]) {
    	ArrayList<Integer> arr=new ArrayList<>();
    	ArrayList<Integer> newArr=new ArrayList<>();
    	arr.add(1);
    	arr.add(1);
    	arr.add(1);
    	arr.add(2);
    	arr.add(2);
    	arr.add(3);
    	for(int a:arr)
    		System.out.print(a+" ");
    	System.out.println();
    	newArr=removeDupes(arr);
    	for(int a:newArr)
    		System.out.print(a+" ");
    	System.out.println();
    }
}