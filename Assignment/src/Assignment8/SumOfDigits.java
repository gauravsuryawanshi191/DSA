package Assignment8;

import java.util.Scanner;

public class SumOfDigits {
	private static int sumOfDigit(int num) {
		if (num == 0)
			return 0;
		else
			return num % 10 + sumOfDigit(num / 10);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a Number: ");
			System.out.println(sumOfDigit(sc.nextInt()));
		}
	}
}
