package core;

import exceptions.LLException;

public class SLL {
	private Node1 head;

	public SLL() {
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insert(int data) {
		Node1 newNode = new Node1(data);
		if (isEmpty())
			head = newNode;
		else {
			Node1 currNode = head;
			while (currNode.getNext() != null) {
				currNode = currNode.getNext();
			}
			currNode.setNext(newNode);
		}
	}

	public int count() throws LLException {
		int count = 1;
		if (isEmpty())
			throw new LLException("Empty List");
		else {
			Node1 counter = head;
			while (counter.getNext() != null) {
				count++;
				counter = counter.getNext();
			}
		}
		return count;
	}

	public void display() throws LLException {
		if (isEmpty())
			throw new LLException("Empty List");
		else {
			Node1 currNode = head;
			while (currNode.getNext() != null) {
				System.out.println(currNode.getData());
				currNode = currNode.getNext();
			}
			System.out.println(currNode.getData());
		}
	}

	public int deleteFromHead() throws LLException {
		if (isEmpty()) {
			throw new LLException("Empty List");
		} else {
			Node1 tempNode = head;
			head = head.getNext();
			return tempNode.getData();
		}
	}

	public int deleteFromTail() throws LLException {
		if (isEmpty()) {
			throw new LLException("Empty List");
		} else {
			Node1 tail = head;
			Node1 tailprior = tail;
			while (tail.getNext() != null) {
				tailprior = tail;
				tail = tail.getNext();
			}
			int data = tail.getData();
			if (tail == head)
				head = null;
			tailprior.setNext(null);
			return data;
		}
	}

	public void deleteFromIntermediate(int data) throws LLException {
		if (isEmpty())
			throw new LLException("Empty String");
		else if (head.getData() == data) {
			this.deleteFromHead();
			System.out.println(data + " deleted.");
		} else {
			Node1 tarNode = head;
			Node1 prior = tarNode;
			while (tarNode.getNext() != null) {
				prior = tarNode;
				tarNode = tarNode.getNext();
				if (tarNode.getData() == data) {
					System.out.println(data + " deleted.");
					prior.setNext(tarNode.getNext());
				}

			}
		}
	}
}
