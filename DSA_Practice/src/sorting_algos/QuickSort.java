package sorting_algos;

public class QuickSort {
    public static void main(String[] args) {
        int i;
        int arr[] = {43, 2, 3, 6, 30, 12, 30, 43, 2, 2, 1};
        
        System.out.println("Original Array:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;

        int pivotIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[si]; // Choose the first element as pivot
        int i = si + 1; // Start from the next element
        int j = ei;

        while (i <= j) {
            // Increment i while elements are smaller than or equal to pivot
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            // Decrement j while elements are greater than pivot
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            // Swap elements if i and j haven't crossed
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at index j
        int temp = arr[si];
        arr[si] = arr[j];
        arr[j] = temp;

        return j; // Return the index of the pivot element
    }
}
