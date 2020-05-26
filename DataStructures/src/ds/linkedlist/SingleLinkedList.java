package ds.linkedlist;

public class SingleLinkedList {

	SingleLinkedListNode head;

	public void show() {
		SingleLinkedListNode node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public void insert(int data) {
		SingleLinkedListNode node = new SingleLinkedListNode();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			SingleLinkedListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void insertAtStart(int data) {
		SingleLinkedListNode node = new SingleLinkedListNode();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}

	}

	public void insertAt(int index, int data) {
		SingleLinkedListNode node = new SingleLinkedListNode();
		node.data = data;
		if (index == 0) {
			insertAtStart(data);
		} else {
			SingleLinkedListNode temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}

	public SingleLinkedListNode delete(int data) {
		SingleLinkedListNode temp = head;
		while (temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
			}
			temp = temp.next;

		}
		return head;
	}

	public void reverseList() {
		SingleLinkedListNode prev, current, nextNode;
		current = head;
		prev = null;
		while (current != null) {
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		head = prev;

	}

	public void reverseUsingRecursion(SingleLinkedListNode headNode) {
		if (headNode == null)
			return;
		reverseUsingRecursion(headNode.next);

	}

}
