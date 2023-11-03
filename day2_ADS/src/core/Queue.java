package core;

import java.util.Arrays;

import exceptions.StackException;

public class Queue {
	private int[] queue;
	private int front;
	private int rear;

	public Queue() {
		queue = new int[5];
		this.front = this.rear = -1;
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public boolean isFull() {
		return rear == queue.length - 1;
	}

	public void enQueue(int data) {
		if (isFull()) {
			int length = queue.length;
			queue = Arrays.copyOf(queue, length * 2);
		}
		queue[++rear] = data;
	}

	public void deQueue() throws StackException {
		if (isEmpty())
			throw new StackException("Queue Empty");
		System.out.println(queue[++front]);
	}
}
