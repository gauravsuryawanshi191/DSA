package core;

import exceptions.LLException;

public class DLL {
	private Node2 head;

	public DLL() {
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void insert(int data) {
		Node2 newNode = new Node2(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node2 tempNode = head;
			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(newNode);
			newNode.setPrevious(tempNode);
		}
	}

	public void display() throws LLException {
		if (isEmpty())
			throw new LLException("Empty List");
		else {
			Node2 tempNode = head;
			while (tempNode.getNext() != null) {
				System.out.println(tempNode.getData());
				tempNode = tempNode.getNext();
			}
			System.out.println(tempNode.getData());
		}
	}

	public int count() throws LLException {
		int count = 1;
		if (isEmpty())
			throw new LLException("Empty List");
		else {
			Node2 tempNode = head;
			while (tempNode.getNext() != null) {
				count++;
				tempNode = tempNode.getNext();
			}
			return count;
		}
	}

	public int deleteFromHead() throws LLException {
		if (isEmpty())
			throw new LLException("Empty List");
		else {
			int data = head.getData();
			head = head.getNext();
			return data;
		}
	}

	public int deleteFromTail() throws LLException {
		if (isEmpty())
			throw new LLException("Empty List");
		else {
			Node2 tempNode = head;
			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}
			int data = tempNode.getData();
			Node2 newTempNode = tempNode.getPrevious();
			newTempNode.setNext(null);
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
			Node2 tempNode = head;
			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
				if (tempNode.getData() == data) {
					System.out.println(data + " delete.");
					Node2 prior = tempNode.getPrevious();
					prior.setNext(tempNode.getNext());
				}
			}
		}
	}
}
