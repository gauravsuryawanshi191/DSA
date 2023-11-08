package Assignment8;

import java.util.Scanner;

public class SquareOfNum {
	public static int squareCalculator(int num) {
		if (num == 0) {
			return 0;
		} else if (num < 0) {
			num = -num;
		}
		return num + squareCalculator(num - 1) + num - 1;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			System.out.println("Square of the number is " + squareCalculator(sc.nextInt()));
		}
	}

}
