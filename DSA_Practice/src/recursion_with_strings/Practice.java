package recursion_with_strings;

public class Practice{
	
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
}