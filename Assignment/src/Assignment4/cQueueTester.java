package Assignment4;

import java.util.Scanner;

public class cQueueTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			System.out.print("Enter Size of Queue: ");
			CircularQueue cqueue = new CircularQueue(sc.nextInt());
			while (!exit) {
				System.out.println("1. Show the contents of circular queue\r\n"
						+ "	2. Enqueue the data in the circular queue\r\n"
						+ "	3. Access the data from the circular queue\r\n"
						+ "	4. Check how many elements are there in the circular queue.\r\n"
						+ "	5. Check to see if the circular queue is full?\r\n"
						+ "	6. Check to see if circular queue is empty.");
				System.out.print("Enter Choice: ");
				switch (sc.nextInt()) {
				case 1:
					System.out.println();
					cqueue.enQueue(sc.nextInt());
					break;
				case 2:
					System.out.print("Enter Data: ");
					cqueue.enQueue(sc.nextInt());
					break;
				case 3:
					cqueue.deQueue();
					break;
				case 4:
					System.out.print("Enter Element to Search: ");
					cqueue.checkElement(sc.nextInt());
					break;
				case 5:
					System.out.println(cqueue.isFull());
					break;
				case 6:
					System.out.println(cqueue.isEmpty());
					break;
				case 7:
					exit = true;
					break;
				default:
					System.out.println("Enter Valid Choice");
					break;
				}
			}
		} catch (StackException e) {
			System.out.println(e.getMessage());
		}

	}

}
