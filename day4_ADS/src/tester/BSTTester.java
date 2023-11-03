package tester;

import core.BST;

public class BSTTester {

	public static void main(String[] args) {
		BST tree = new BST();
		tree.addNode(10);
		tree.addNode(5);
		tree.addNode(15);
		tree.addNode(17);
		tree.addNode(3);
		tree.addNode(7);
		tree.preOrder();
		System.out.println();
		tree.inOrder();
		System.out.println();
		tree.postOrder();

	}
}
