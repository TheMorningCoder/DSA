package linked_list;


public class MergeSortedArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,3,5,6,7};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		for(int i:b)
			System.out.print(i+" ");
		System.out.println();
		int arr[]=merge(a,b);
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
	}
	
	public static int[] merge(int a[],int b[]) {
		int i=0,j=0,k=0;
		int len1=a.length;
		int len2=b.length;
		int arr[]= new int[len1+len2];
		
		while(i<len1&&j<len2) {
			if(a[i]<b[j])
			{
				arr[k++]=a[i++];
//				k++;
//				i++;
			}
			else
			{
				arr[k++]=b[j++];
//				k++;
//				j++;
			}
						
		}
		if(i<len1) {
			while(i<len1) {
				arr[k++]=a[i++];
//				k++;
//				i++;
			}
		}
		if(j<len2) {
			while(j<len2) {
				arr[k++]=b[j++];
//				k++;
//				j++;
			}
		}
		
		return arr;
	}
}
