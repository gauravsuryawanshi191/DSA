package Assignment8;

import java.util.Scanner;

public class Factorial {
	public static long FactorialCalculator(int num, long accumulator) {
		if (num == 0 || num == 1) {
			return accumulator;
		} else {
			return FactorialCalculator(num - 1, num * accumulator);
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("Enter a number: ");
			System.out.println("Factorial of the number: " + FactorialCalculator(sc.nextInt(), 1));
		}
	}
}
