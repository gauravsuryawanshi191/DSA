package Assignment3;

public class Queue {

	private int rear;
	private int front;
	private int[] arr;
	private int capacity;
	int counter;

	public Queue(int capacity) {
		this.rear = 0;
		this.front = 0;
		this.arr = new int[capacity];
		this.capacity = capacity;
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public boolean isFull() {
		return rear == capacity;
	}

	public void enqueue(int element) {
		if (rear == capacity - 1 || front == -1) {
			System.out.println("queue is full");
		}
		rear++;
		arr[rear] = element;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("queue is empty");
		}
		int element = arr[front];
		front++;
		return element;
	}

	public void display() {
		for (int i = front + 1; i <= rear; i++) {
			System.out.print(arr[i]);
		}
	}

	public int count() {
		for (int i = front + 1; i <= rear; i++) {
			counter++;
		}
		return counter;

	}
}
