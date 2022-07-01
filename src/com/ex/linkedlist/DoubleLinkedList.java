package com.ex.linkedlist;

public class DoubleLinkedList<T> {
	public Node<T> head = null;
	public Node<T> tail = null;

	public class Node<T> {
		T data;
		Node<T> prev = null;
		Node<T> next = null;

		public Node(T data) {
			this.data = data;
		}
	}

	public void addNode(T data) {
		if (this.head == null) {
			this.head = new Node<T>(data);
			this.tail = this.head;
		} else {
			Node<T> node = this.head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = new Node<T>(data);
			node.next.prev = node;
			this.tail = node.next;
		}
	}

	public void printAll() {
		if (this.head != null) {
			Node<T> node = this.head;
			System.out.println(node.data);
			while (node.next != null) {
				node = node.next;
				System.out.println(node.data);
			}
		}
	}

	public static void main(String[] args) {
		DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();
		
		MyLinkedList.addNode(2);
		MyLinkedList.addNode(3);
		MyLinkedList.addNode(4);
		MyLinkedList.addNode(8);
		MyLinkedList.addNode(3);
		
		MyLinkedList.printAll();
		
	}
}