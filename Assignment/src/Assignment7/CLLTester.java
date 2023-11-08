package Assignment7;

import java.util.Scanner;

public class CLLTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CLL list = new CLL();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Show the contents of linked list\r\n" + "2.Insert the data in the linked list\r\n"
						+ "3.Check how many elements are there in the linked list.\r\n"
						+ "4.Check to see if linked list is empty.\n"
						+ "5.Delete the data in the Circular LinkedList.\n" + "6.Exit.");
				System.out.print("Enter Choice: ");
				try {
					switch (sc.nextInt()) {
					case 1:
						list.display();
						break;
					case 2:
						System.out.print("Enter Element: ");
						list.enqueue(sc.nextInt());
						break;
					case 3:
						System.out.println(list.count());
						break;
					case 4:
						System.out.println(list.isEmpty());
						break;
					case 5:
						System.out.println(list.dequeue());
						break;
					case 6:
						exit = true;
						break;
					default:
						System.out.println("Enter Valid Choice.");
						break;
					}
				} catch (LLException e) {
					System.out.println(e.getMessage());
				}

			}

		}

	}

}
