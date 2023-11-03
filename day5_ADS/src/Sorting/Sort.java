package Sorting;

import java.util.Scanner;

public class Sort {

	public static void display(int arr[]) {
		System.out.print("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] <= arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - (i + 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > key)
					arr[j + 1] = arr[j];
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter no of Elements: ");
			int arr[] = new int[sc.nextInt()];
			System.out.println("Enter Elements:");
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter " + (i + 1) + " element: ");
				arr[i] = sc.nextInt();
			}
			boolean exit = false;
			while (!exit) {
				System.out.println("\n\n1.Display Array.\n" + "2.Sort using Selection Sort.\n"
						+ "3.Sort using Bubble Sort.\n" + "4.Sort using Insertion Sort.\n" + "5.Exit.");
				System.out.print("Enter Choice: ");
				switch (sc.nextInt()) {
				case 1:
					display(arr);
					break;
				case 2:
					selectionSort(arr);
					System.out.println("Sorted Using Selection Sort.");
					display(arr);
					break;
				case 3:
					bubbleSort(arr);
					System.out.println("Sorted using Bubble Sort.");
					display(arr);
					break;
				case 4:
					insertionSort(arr);
					System.out.println("Sorted using Insertion Sort.");
					display(arr);
					break;
				case 5:
					exit = true;
					break;
				default:
					System.out.println("Enter Valid Choice.");
					break;
				}
			}
		}
	}

}
