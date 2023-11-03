package Sorting;

public class QuickSort {
	public static void quickSort(int arr[]) {
		int pivot = (arr.length - 1);
		int low = -1;
		quickSort(arr, low, pivot);
	}

	public static void quickSort(int arr[], int low, int pivot) {
		int high;
		for (high = low + 1; high < pivot; high++) {
			if (arr[high] < arr[pivot]) {
				low++;
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		}
		low++;
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;

		// quickSort(arr, -1, low - 1);
//		quickSort(arr, low, arr.length - 1);

	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}