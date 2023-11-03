package core;

public class Node1 {
	private int data;
	private Node1 next;

	public Node1(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 next) {
		this.next = next;
	}

}
