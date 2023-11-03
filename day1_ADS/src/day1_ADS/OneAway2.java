package day1_ADS;

import java.util.Scanner;

public class OneAway2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter String1: ");
			String s1 = sc.next();
			System.out.print("Enter String2: ");
			String s2 = sc.next();
			String temp1 = null, temp2 = null;
			int cnt = 0;
			if ((s1.length() - s2.length() > 1) || (s1.length() - s2.length() < -1)) {
				System.out.println("Not One Away!");
			} else {
				if (s1.length() - s2.length() != 0) {
					if (s1.length() > s2.length()) {
						temp1 = s1;
						temp2 = s2;
					} else {
						temp1 = s2;
						temp2 = s1;
					}
					for (int i = 0; i < temp2.length(); i++) {
						if ((temp2.charAt(i) == temp1.charAt(i)) || (temp2.charAt(i) == temp1.charAt(i + 1)))
							cnt++;
					}
					if (cnt == temp2.length())
						System.out.println("One Away");

					else
						System.out.println("Not One Away!");
				} else {
					for (int i = 0; i < s2.length(); i++) {
						if (s1.charAt(i) == s2.charAt(i))
							cnt++;
					}
					if (cnt == s1.length() - 1)
						System.out.println("One Away");

					else
						System.out.println("Not One Away!");
				}
			}
		}
	}

}
