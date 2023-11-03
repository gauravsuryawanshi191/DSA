package Assignment2;

import java.util.Scanner;

public class StackTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter no of elements");
			int capacity = sc.nextInt();
			boolean exit = false;
			Stack s = new Stack(capacity);
			while (!exit) {
				System.out.println(
						"enter choice \n 1.display contents \n 2.Push \n 3.Pop \n 4.display elements in queue \n 5.check if stack is full \n 6.check if Stack is empty \n ");

				switch (sc.nextInt()) {
				case 1:
					s.display();
					break;
				case 2:
					System.out.println("enter element to enter in queue");

					s.push(sc.nextInt());
					System.out.println("element added !!");
					break;
				case 3:
					s.pop();
					break;
				case 4:
					int count = s.count();
					System.out.println("no of elements: " + count);
					break;
				case 5:
					System.out.println("Is stack full?:" + s.isFull());
					break;
				case 6:
					System.out.println("Is stack empty?:" + s.isEmpty());
					break;
				case 7:
					exit = true;
					break;

				}

			}

		}

	}

}
