package Assignment3;

import java.util.Scanner;

public class QueueTester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter no of elements");
			int capacity = sc.nextInt();
			boolean exit = false;

			Queue queue = new Queue(capacity);
			while (!exit) {
				System.out.println(
						"enter choice \n 1.display contents \n 2.Enqueuue \n 3.Dequeue \n 4.display elements in queue \n 5.check if queue is full \n 6.check if queue is empty \n ");

				switch (sc.nextInt()) {
				case 1:
					queue.display();
					break;
				case 2:
					System.out.println("enter element to enter in queue");
					queue.enqueue(sc.nextInt());
					System.out.println("element added !!");
					break;
				case 3:
					queue.dequeue();
					break;
				case 4:
					int count = queue.count();
					System.out.println("no of elements: " + count);
					break;
				case 5:
					System.out.println("Is queue full?:" + queue.isFull());
					break;
				case 6:
					System.out.println("Is queue empty?:" + queue.isEmpty());
					break;
				case 7:
					exit = true;
					break;
				}
			}
		}
	}
}
