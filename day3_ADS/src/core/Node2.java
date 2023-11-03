package core;

public class Node2 {
	private int data;
	private Node2 previous;
	private Node2 next;

	public Node2(int data) {
		this.data = data;
		this.previous = null;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public Node2 getPrevious() {
		return previous;
	}

	public void setPrevious(Node2 previous) {
		this.previous = previous;
	}

	public Node2 getNext() {
		return next;
	}

	public void setNext(Node2 next) {
		this.next = next;
	}

}
