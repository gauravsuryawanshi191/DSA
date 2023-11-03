package day1_ADS;

import java.util.Scanner;

public class MostFreqItem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter size of Array: ");
			int arr[] = new int[sc.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			if (arr.length == 0)
				System.out.println("Null");
			else {
				int count;
				int maxCount = 0;
				int value = 0;
				for (int i = 0; i < arr.length; i++) {
					count = 1;
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] == arr[j])
							count++;
					}
					if (maxCount <= count) {
						maxCount = count;
						value = arr[i];
					}
				}
				System.out.println("Value: " + value + " occured " + maxCount + " times.");
			}
		}

	}
}