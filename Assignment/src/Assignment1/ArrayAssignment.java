package Assignment1;
/*
Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the array.
2. Initialize the array using user input.
3. Create the functions for the following and call them using a menu based program.
	a. Display the array
	b. Reverse the array
	c. Replace the nth element from the array and print
	d. Find the addition of all elements of the array
	e. Find the maximum number from the array
	f. Print the average of all the elements from the array.
	g. Display the even and odd number from the array separately.
 */

import java.util.Scanner;

public class ArrayAssignment {
	private int[] arr;
	private int size;

	public ArrayAssignment(int size) {
		arr = new int[size];
		this.size = size;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public void reverseDisplay() {
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}

	public void replaceAndPrint(int index, int data) {
		System.out.println(arr[index]);
		arr[index] = data;
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public int max() {
		int max = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public int average() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
		return sum / size;
	}

	public void evenAndOdd() {
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print("Even Numbers:");
				System.out.print(arr[i] + " ");
			} else {
				System.out.print("Odd Numbers:");
				System.out.println(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Size of Array: ");
			ArrayAssignment testArr = new ArrayAssignment(sc.nextInt());
			System.out.println("Enter" + testArr.size + "elements:");
			for (int i = 0; i < testArr.size; i++) {
				testArr.arr[i] = sc.nextInt();
			}
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Display the array\n" + "2.Reverse the array\n"
						+ "3.Replace the nth element from the array and print\n"
						+ "4.Find the addition of all elements of the array\n"
						+ "5.Find the maximum number from the array\n"
						+ "6.Print the average of all the elements from the array\n"
						+ "7.Display the even and odd number from the array separately.\n" + "8.Exit");
				System.out.print("Enter Choice: ");
				switch (sc.nextInt()) {
				case 1:
					testArr.display();
					break;
				case 2:
					testArr.reverseDisplay();
					break;
				case 3:
					System.out.println("Enter Index and Data");
					testArr.replaceAndPrint(sc.nextInt(), sc.nextInt());
					break;
				case 4:
					System.out.println(testArr.sum());
					break;
				case 5:
					System.out.println(testArr.max());
					break;
				case 6:
					System.out.println(testArr.average());
					break;
				case 7:
					testArr.evenAndOdd();
					break;
				case 8:
					exit = true;
					break;

				default:
					break;
				}
			}
		}
	}

}
