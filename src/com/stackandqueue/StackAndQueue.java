package com.stackandqueue;

public class StackAndQueue {

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and queue Program");
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println(stack);
		while(!stack.isEmpty()) {
			System.out.println("Peek element is "+stack.peek());
			System.out.println("Pop element is "+stack.pop());
		}
		System.out.println(stack);
	}

}
