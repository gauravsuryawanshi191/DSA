package Assignment7;

public class CLL {
	private Node head;
	private Node tail;

	public CLL() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail = newNode;
			tail.setNext(head);
		}
	}

	public int dequeue() throws LLException {
		if (isEmpty()) {
			throw new LLException("List is empty");
		} else {
			int tempNode = head.getData();
			if (head.getNext() == null) {
				System.out.println("head is null");
				head = null;
			} else {
				head = head.getNext();
				head.setPrevious(null);
			}
			return tempNode;
		}
	}

	public void display() throws LLException {
		if (isEmpty())
			System.out.println("List is empty");
		else {
			Node tempNode = head;
			do {
				System.out.println(tempNode.getData());
				tempNode = tempNode.getNext();
			} while (tempNode != head);
		}
	}

	public int count() throws LLException {
		if (isEmpty()) {
			System.out.println("List is empty");
			return -1;
		} else {
			Node tempNode = head;
			int count = 0;
			do {
				tempNode = tempNode.getNext();
				count++;
			} while (tempNode != head);
			return count;
		}
	}

}
