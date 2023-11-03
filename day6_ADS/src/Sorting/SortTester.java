package Sorting;

public class SortTester {
	public static void main(String[] args) {
		int arr[] = { 22, 2, 9, 7, 11, 8 };
		QuickSort.quickSort(arr);
		QuickSort.display(arr);
	}
}
/*
 * package Sorting;
 * 
 * public class QuickSort { public static void quickSort(int arr[]) { int high =
 * 0; int low = high - 1; quickSort(arr, low, high); }
 * 
 * public static void quickSort(int arr[], int low, int high) { int pivot =
 * (arr.length - 1); for (high = 0; high < pivot; high++) { if (arr[high] <
 * arr[pivot]) { low++; int temp = arr[low]; arr[low] = arr[high]; arr[high] =
 * temp; } } low++; int temp = arr[low]; arr[low] = arr[high]; arr[high] = temp;
 * // quickSort(arr, -1, 0); // quickSort(arr, (pivot + 1), high);
 * 
 * }
 * 
 * public static void display(int arr[]) { for (int i = 0; i < arr.length; i++)
 * { System.out.print(arr[i] + " "); } } }
 */