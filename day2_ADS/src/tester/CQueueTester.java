package tester;

import core.CircularQueue;
import exceptions.StackException;

public class CQueueTester {

	public static void main(String[] args) {
		try {
			CircularQueue cqueue = new CircularQueue();
			System.out.println(cqueue.isEmpty());
			System.out.println(cqueue.isFull());
			cqueue.enQueue(10);
			cqueue.enQueue(20);
			cqueue.enQueue(10);
			cqueue.enQueue(20);
			cqueue.enQueue(10);
			cqueue.enQueue(30);
			System.out.println(cqueue.isEmpty());
			System.out.println(cqueue.isFull());
		} catch (StackException e) {
			System.out.println(e.getMessage());
		}

	}

}
