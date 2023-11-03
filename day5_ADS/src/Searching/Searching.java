package Searching;

import java.util.Scanner;

public class Searching {
	public static int linearSearch(int array[], int data) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == data)
				return i;
		}
		return -1;
	}

	public static int binarySearch(int array[], int data) {
		int low = 0;
		int high = array.length;
		int mid = low + (high / 2);
		if (data >= mid)
			high = mid;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			System.out.print("Enter number to search: ");
			int data = sc.nextInt();
			int index = linearSearch(arr, data);
			if (index == -1)
				System.out.println(data + " not Present.");
			else
				System.out.println("Index Position of " + data + " is " + index);
		}
	}
}
