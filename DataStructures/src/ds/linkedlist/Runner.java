package ds.linkedlist;

public class Runner {

	public static void main(String[] args) {
				
		SingleLinkedList list=new SingleLinkedList();
		list.insert(23);
		list.insert(14);
		list.insert(45);
		list.insert(56);
		
		list.insertAtStart(66);
		list.insertAt(2, 88);
		SingleLinkedListNode headNode=list.delete(14);
		list.show();
//		list.reverseList();
//		System.out.println("--Reverse--");
//		list.show();
		list.reverseUsingRecursion(headNode);
		System.out.println("--Reverse using recursion--");
		list.show();
		

	}

}
