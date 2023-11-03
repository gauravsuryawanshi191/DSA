package tester;

import core.Queue;
import exceptions.StackException;

public class QueueTester {

	public static void main(String[] args) {
		try {
			Queue queue1 = new Queue();
			queue1.enQueue(10);
			queue1.enQueue(20);
			queue1.deQueue();
			queue1.deQueue();

		} catch (StackException e) {
			System.out.println(e.getMessage());
		}

	}

}
