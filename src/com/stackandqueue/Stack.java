package com.stackandqueue;

public class Stack <Type extends Comparable<Type>> extends LinkedList<Type>{
	Stack() {
		super();
	}

	public void push(Type item) {
		super.add(item);
	}
	
	@Override
	public Type pop() {
		return super.pop();
	}
	
	public Type Peek() {
		return super.headItem();
	}
}
