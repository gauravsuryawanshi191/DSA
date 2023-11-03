package Assignment2;

public class Stack {

	static int[] arr;
	private int top;
	private int capacity;
	private int counter;

	public Stack(int capacity) {

		this.top = -1;
		this.arr = new int[capacity];

	}

	public void push(int element) {
		if (top == arr.length - 1) {
			throw new RuntimeException("stack is full");
		}
		top++;
		arr[top] = element;

	}

	public int pop() {
		if (top == -1) {
			throw new RuntimeException("stack is empty");
		}
		int element = arr[top];
		top--;
		return element;

	}

	public boolean isEmpty() {
		return top == -1;

	}

	public boolean isFull() {
		return top == arr[arr.length - 1];
	}

	void display() {
		System.out.println("Printing stack elements .....");
		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public int count() {

		for (int i = 0; i <= top; i++) {
			counter++;

		}
		return counter;

	}
}
