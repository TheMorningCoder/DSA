package sorting_algos;

public class MergeSort {
	public static void main(String args[]) {
		
		int arr[]= {11,40,2,13,6,8,10};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		mergeSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void mergeSort(int []arr) {
		if(arr.length==1)
			return;
		else {
		 int len=arr.length;
		 int len1=arr.length/2;
		 int len2=arr.length-len1;
		 int a1[]=new int[len1];
		 int a2[]=new int[len2];
		 for(int i=0;i<len1;i++) {
			 a1[i]=arr[i];
		 }
		 for(int i=len1;i<len;i++) {
			 a2[i-len1]=arr[i];
		 }
		 mergeSort(a1);
		 mergeSort(a2);
		 merge(a1,a2,arr);
		}
	}
	public static void merge(int a1[],int a2[],int arr[]) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a1.length&&j<a2.length) {
			if(a1[i]<a2[j]) {
				arr[k]=a1[i];
				i++;
				k++;
			}
			else {
				arr[k]=a2[j];
				j++;
				k++;
			}
		}
		while(i<a1.length) {
			arr[k]=a1[i];
			i++;
			k++;
		}
		while(j<a2.length) {
			arr[k]=a2[j];
			j++;
			k++;
		}
		
		
	}

}
