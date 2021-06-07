package Stack;

public class StackImplUsingLinkedList {
	private Node head;

	public class Node {
		int value;
		Node next;
	}

	public StackImplUsingLinkedList() {
		head = null;
	}

	public void push(int value) {
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.next = extraHead;
	}

	public int pop() {
		if (head == null) {
			System.out.println("Stack is empty");
		}
		int value = head.value;
		head = head.next;
		return value;
	}

	public static void main(String[] args) {
		StackImplUsingLinkedList s = new StackImplUsingLinkedList();
		// System.out.println(s.pop());
		s.push(10);
		s.push(20);
		System.out.println("Poped: " + s.pop());
		s.push(55);
		System.out.println("Poped: " + s.pop());

	}

}
