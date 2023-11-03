package tester;

import core.Stack1;
import exceptions.StackException;

public class StackTester1 {

	public static void main(String[] args) {
		try {
			Stack1 data = new Stack1();
			data.push(10);
			data.push(20);
			data.push(20);
			data.push(20);
			data.push(20);
			data.push(20);
			data.push(10);
			data.push(10);
			data.push(10);
			data.pop();
			data.pop();
			data.pop();
			data.pop();
			data.pop();
			data.pop();
			data.pop();
			data.pop();
			data.pop();
			data.pop();
			data.pop();
		} catch (StackException e) {
			System.out.println(e.getMessage());
		}
	}

}
