package com.sumeet.DynamicArrayStackDemo;

public class DStack {

	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	public void push(int data)
	{
		if(size() == capacity)
		{
			
		}
		stack[top] = data;
		System.out.println("push " + top);
		top++;
		
	}
	private void expand()
	{
		int currentLength = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, currentLength);
		stack = newStack;
		capacity = capacity * 2;
	}
	public int pop()
	{
		int data = 0;
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else 
		{
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return data;
	}
//	if the number of elements in the stack go below 1/4 , we make it half 
	private void shrink()
	{
		int length = size();
		if(length <= (capacity/2)/2)
		{
			capacity = capacity/2;
		}
		int newShrunkStack[] = new int[capacity];
		stack = newShrunkStack;
	}
	public int peek()
	{
		int data;
		data = stack[top-1];
		return data;
	}
	
	public int size()
	{
		return top;
	}
	public boolean isEmpty()
	{
		return top<=0;
	}
	public void show()
	{
		for(int n : stack)
		{
			System.out.print(n+" ");
		}
	}
	
}
