package LinkedList;

public class CreateLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void printMyLinkedList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {

		CreateLinkedList c = new CreateLinkedList();
		Node first = c.new Node(10);
		c.head = first;
		Node second = c.new Node(20);
		first.next = second;
		Node third = c.new Node(30);
		second.next = third;

		c.printMyLinkedList();
	}
}
