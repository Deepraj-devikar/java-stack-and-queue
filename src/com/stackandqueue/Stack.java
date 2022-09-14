package com.stackandqueue;

public class Stack <Type extends Comparable<Type>> extends LinkedList<Type>{
	Stack() {
		super();
	}

	/**
	 * add item to the head of the stack
	 * @param item
	 */
	public void push(Type item) {
		super.add(item);
	}
	
	/**
	 * remove item at the head of stack then remove element from head and shift head to the next element
	 */
	@Override
	public Type pop() {
		return super.pop();
	}
	
	/**
	 * returns the element at head position of the stack and do nothing operations
	 * @return head item from linked list
	 */
	public Type Peek() {
		return super.headItem();
	}
}
