public class Stack<T> {
	private static class Node<T> {
		private T data;
		private Node<T> next;

		private Node(T data) {
			this.data = data;
		}
	}
	private Node<T> top;

	public T pop() {
		if (top == null) return null;
		T item = top.data;
		top = top.next;
		return item;
	}

	public void push(T item) {
		Node<T> n = new Node<T>(item);
		n.next = top;
		top = n;
	}

	public T peek() {
		if (top == null) return null;
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}
}
