package com.ex.stack;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack<Integer> ms = new MyStack<Integer>();
		ms.push(1);
		ms.push(2);
		System.out.println(ms.pop());
		ms.push(3);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
	}
}
