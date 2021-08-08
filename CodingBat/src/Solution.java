import java.io.BufferedWriter;
import java.io.IOException;

public class Solution {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	static SinglyLinkedListNode removeNodes(SinglyLinkedListNode listHead, int x) {

		SinglyLinkedList list = new SinglyLinkedList();
		SinglyLinkedListNode node = listHead;
		while (node.next != null) {
			if (node.data <= x) {
				list.insertNode(node.data);

			}
			node = node.next;
		}
		if (node.data <= x) {
			list.insertNode(node.data);
		}

		return list.head;

	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertNode(10);
		list.insertNode(9);
		SinglyLinkedListNode newNOde = removeNodes(list.head, 9);
		System.out.println(newNOde);
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new
		 * FileWriter(System.getenv("OUTPUT_PATH"))); printSinglyLinkedList(newNOde,
		 * "\n", bufferedWriter ); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */
	}

}
