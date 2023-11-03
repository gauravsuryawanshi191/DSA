package core;

public class BST {
	private Node root;

	public BST() {
		this.root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (root == null)
			root = newNode;
		else
			addNode(root, newNode);
	}

	private void addNode(Node root, Node newNode) {
		if (root.getData() > newNode.getData()) {
			if (root.getLeft() == null)
				root.setLeft(newNode);
			else
				addNode(root.getLeft(), newNode);
		} else {
			if (root.getRight() == null)
				root.setRight(newNode);
			else
				addNode(root.getRight(), newNode);
		}
	}

	public void preOrder() {
		System.out.print("PreOrder: ");
		preOrder(root);
	}

	private void preOrder(Node node) {
		if (node == null)
			return;
		else {
			System.out.print(node.getData() + " ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	public void inOrder() {
		System.out.print("InOrder: ");
		inOrder(root);
	}

	private void inOrder(Node node) {
		if (node == null)
			return;
		else {
			preOrder(node.getLeft());
			System.out.print(node.getData() + " ");
			preOrder(node.getRight());
		}
	}

	public void postOrder() {
		System.out.print("PostOrder: ");
		postOrder(root);
	}

	private void postOrder(Node node) {
		if (node == null)
			return;
		else {
			preOrder(node.getLeft());
			preOrder(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

}
