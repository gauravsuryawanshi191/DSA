package day1_ADS;

import java.util.ArrayList;

public class CommonIn2Arrays {

	public static void main(String[] args) {
		int a1[] = { 1, 3, 4, 6, 7 };
		int a2[] = { 1, 2, 4, 5, 9, 10 };
//		if (a1.length > a2.length)
//			a3len = a2.length;
//		a3len = a1.length;
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		for (int i = 0; i < a1.length; ++i) {
			for (int j = 0; j < a2.length; ++j) {
				if (a1[i] == a2[j]) {
					a3.add(a1[i]);
				}
			}
		}
		for (int i : a3)
			System.out.print(i + " ");
	}

}
