package core;

import java.util.Arrays;

import exceptions.StackException;

public class CircularQueue {
	private int[] cQueue;
	private int front;
	private int rear;

	public CircularQueue() {
		cQueue = new int[5];
		this.rear = this.front = -1;
	}

	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	public boolean isFull() {
		return (rear + 1) % cQueue.length == front;
	}

	public void enQueue(int data) throws StackException {
		if (isFull())
			throw new StackException("Queue Full!");
		cQueue[++rear] = data;
		if (front == -1)
			front++;
	}

	public void deQueue() throws StackException {
		if (isEmpty())
			throw new StackException("Empty Queue!");
		System.out.println(cQueue[front]);
		front = (front + 1) % cQueue.length;
	}
}
