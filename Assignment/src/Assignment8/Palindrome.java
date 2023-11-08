package Assignment8;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(int num) {
		int originalNum = num;
		int reversedNum = 0;
		while (num > 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num = num / 10;
		}
		return originalNum == reversedNum;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			boolean isPalindrome = checkPalindrome(number);
			if (isPalindrome) {
				System.out.println(number + " is a palindrome.");
			} else {
				System.out.println(number + " is not a palindrome.");
			}
		}
	}

}
