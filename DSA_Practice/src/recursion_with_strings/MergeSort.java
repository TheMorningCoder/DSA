package recursion_with_strings;

public class MergeSort {

	public static void main(String[] args) {
		int a[]= {16,2,24,9};
		mergeSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
	}

	public static void mergeSort(int a[]) {
		if (a.length <= 1) {
			return;
		}
		int b[] = new int[a.length / 2];
		int c[] = new int[a.length - b.length];
		for (int i = 0; i < a.length / 2; i++) {
			b[i] = a[i];
		}
		for (int i = a.length / 2; i < a.length; i++) {
			c[i - a.length / 2] = a[i];
		}
		mergeSort(b);
		mergeSort(c);
		merge(b, c, a);

	}

	public static void merge(int sub1[], int sub2[], int arr[]) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < sub1.length && j < sub2.length) {
			if (sub1[i] < sub2[j]) {
				arr[k] = sub1[i];
				k++;
				i++;
			} else {
				arr[k] = sub2[j];
				k++;
				j++;
			}
		}

		while (i < sub1.length) {
			arr[k] = sub1[i];
			k++;
			i++;
		}
		while (j < sub2.length) {
			arr[k] = sub2[j];
			k++;
			j++;
		}
	}
}
