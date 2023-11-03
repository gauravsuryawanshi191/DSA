package core;

import java.util.Arrays;

import exceptions.StackException;

public class Stack1 {
	private int[] stack;
	private int top = -1;

	public Stack1() {
		stack = new int[5];
	}

	public Stack1(int size) {
		stack = new int[size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == stack.length - 1;
	}

	public void push(int temp) {
		if (isFull()) {
			int length = stack.length;
			stack = Arrays.copyOf(stack, length * 2);
		}
//			System.out.println("Stack OverFlow"); 
		stack[++top] = temp;
	}

	public void pop() throws StackException {
		if (isEmpty())
			throw new StackException("Stack UnderFlow");
		System.out.println(stack[top--]);
	}

	public void peek() {
		if (isEmpty())
			System.out.println("Stack UnderFlow");
		System.out.println(stack[top]);
	}
}
