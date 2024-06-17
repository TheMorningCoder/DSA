package recursion_with_strings;

public class QuickSort {

	public static void main(String[] args) {
		int i;
		int arr[]= {43,2,3,6,30,12,45,60,90,30,43,2,2,1};
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		quickSort(arr, 0, arr.length - 1);
		for ( i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void quickSort(int arr[], int startIndex, int endIndex) {
		int pivotIndex;
		if (startIndex >= endIndex) {
			return;
		}
		pivotIndex = findPivot(arr, startIndex, endIndex);
		quickSort(arr, startIndex, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, endIndex);
	}

	public static int findPivot(int a[], int si, int ei) {
		int pivotIndex, temp, i, j, smallerNumberCount = 0;
		System.out.println();
		for (i = si+1; i <=ei; i++) {
			if (a[si] > a[i])
				smallerNumberCount++;
		}
		pivotIndex = smallerNumberCount + si;
		temp = a[pivotIndex];
		a[pivotIndex] = a[si];
		a[si] = temp;

		i = si;
		j = ei;
		while (i < j) {
			if (a[i] < a[pivotIndex])
				i++;
			else if (a[j] > a[pivotIndex])
				j--;
			else {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}

		return pivotIndex;
	}

}
