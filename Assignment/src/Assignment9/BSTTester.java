package Assignment9;

import java.util.Scanner;

public class BSTTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			BST tree = new BST();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Insert the data into the binary search tree\r\n"
						+ "2.Show the contents using Inoder traversal\r\n"
						+ "3.Show the contents using preorder traversal\r\n"
						+ "4.Show the contents using postoder traversal\n" + "5.Exit");
				System.out.print("Enter Choice: ");
				switch (sc.nextInt()) {
				case 1:
					System.out.print("Enter Data: ");
					tree.addNode(sc.nextInt());
					break;
				case 2:
					tree.inOrder();
					break;
				case 3:
					tree.preOrder();
					break;
				case 4:
					tree.postOrder();
					break;
				case 5:
					exit = true;
					break;
				default:
					System.out.println("Enter Valid Choice.");
					break;
				}
			}
		}

	}
}
