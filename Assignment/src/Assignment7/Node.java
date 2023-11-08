package Assignment7;

public class Node {
	private int data;
	private Node previous;
	private Node next;

	public Node(int data) {
		this.data = data;
		this.previous = null;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
