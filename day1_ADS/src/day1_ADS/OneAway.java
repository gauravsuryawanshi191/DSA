package day1_ADS;

import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {// ac,abc
			System.out.print("Enter String1: ");
			String s1 = sc.next();
			System.out.print("Enter String2: ");
			String s2 = sc.next();
			if ((s1.length() - s2.length() > 1) || (s1.length() - s2.length() < -1)) {
				System.out.println("Not One Away!");
			} else {
				if (s1.length() - s2.length() == 0) {
					if (s1.contains(s2))
						System.out.println("One Away");
					else
						System.out.println("Not One Away!");
				} else if (s1.length() - s2.length() == 1) {
					if (s1.contains(s2))
						System.out.println("One Away");
					else
						System.out.println("Not One Away!");
				} else {
					if (s2.contains(s1))
						System.out.println("One Away");
					else
						System.out.println("Not One Away!");
				}
			}
		}
	}

}
