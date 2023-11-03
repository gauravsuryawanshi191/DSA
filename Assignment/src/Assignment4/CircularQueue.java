package Assignment4;

/*
Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the circular queue using array.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
	a. Show the contents of circular queue
	b. Enqueue the data in the circular queue
	c. Access the data from the circular queue
	d. Check how many elements are there in the circular queue.
	e. Check to see if the circular queue is full?
	f. Check to see if circular queue is empty.
 */
public class CircularQueue {
	private int[] cQueue;
	private int front;
	private int rear;

	public CircularQueue(int size) {
		cQueue = new int[size];
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

	public void checkElement(int data) throws StackException {
		if (isEmpty())
			throw new StackException("Queue Empty");
		else {
			while (front == -1) {
				if (cQueue[front] == data)
					System.out.println("Present");
				front = (front + 1) % cQueue.length;
			}
		}
	}
}
