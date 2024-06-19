package recursion_with_strings;


public class Practice{
	
	public static void main(String args[]) {
		int arr[]= {2,3,5,3,2,1,2,3,6,7};
		int ele=3;
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		int k=removeElement(arr,ele);
		System.out.println(k);
		for(int i=0;i<arr.length;i++) {
			if(i<k)
				System.out.print(arr[i]+",");
			else
				System.out.print("_,");
		}
	}
	public static int removeElement(int num[],int e) {
		int k=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]!=e) {
				num[k]=num[i];
				k++;
			}
		}
		
		return k;
	}
}




















//public class Practice{
//	public static void main(String args[]) {
//		int arr[]= {1,2,6,13,14,25,26,37,38,39};	
//		for (int i: arr)
//			System.out.print(i+" ");
//		System.out.println();
//		int ele=6;
//		int index=binarySearch(arr,0,arr.length-1,ele);
//		System.out.println("Element "+ele+" is at index: "+(index));
//	}
//	public static int binarySearch(int arr[],int startIndex,int endIndex,int element) {
//		if(arr.length==0)
//			return -1;
//		if(startIndex>endIndex)
//			return -1;
//		
//		
//		int midIndex=(startIndex+endIndex)/2;
//		if(element==arr[midIndex])
//			return midIndex;
//		
//		else {
//			if(element>arr[midIndex])
//				return binarySearch(arr,midIndex+1,endIndex,element);
//			else
//				return binarySearch(arr,startIndex,midIndex-1,element);
//		}
//		
//	}
//}


//public class Practice{
//	public static void main(String args[]) {
//		String str="xxxyyywwwzzsserdaaa";
//		System.out.println(str);
//		String s=removeConsecutiveDupes(str);
//		System.out.println(s);
//	}
//	public static String removeConsecutiveDupes(String s) {
//		
//		if(s.length()<2)
//			return s;
//		else {
//			if(s.charAt(0)==s.charAt(1)) {
//				return removeConsecutiveDupes(s.substring(1));
//			}
//			else {
//				return s.charAt(0)+removeConsecutiveDupes(s.substring(1));
//			}
//		}
//	}
//}



/*public class Practice{
	
	public static void main(String args[]) {
		int arr[]= {43,2,3,6,30,12,45,60,90,30,43,2,2,1};
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void quickSort(int arr[],int startIndex,int endIndex) {
		if(startIndex>=endIndex)
			return;
		int pivot=findPivot(arr,startIndex,endIndex);
		quickSort(arr,startIndex,pivot-1);
		quickSort(arr,pivot+1,endIndex);
	}
	public static int findPivot(int a[],int si,int ei) {
		int pivotIndex,temp,smallCountNumber=0;
		for(int i=si+1;i<=ei;i++) {
			if(a[si]>a[i])
				smallCountNumber++;
		}
		pivotIndex=smallCountNumber+si;
		
		temp=a[pivotIndex];
		a[pivotIndex]=a[si];
		a[si]=a[pivotIndex];
		
		int i=si;
		int j=ei;
		
		while(i<j) {
			if(a[i]<a[pivotIndex])
				i++;
			else if(a[j]>a[pivotIndex])
				j--;
			else {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		
		return pivotIndex;
	}
}*/