package com.sumeet.DynamicArrayStackDemo;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DStack nums = new DStack();
		System.out.println(nums.isEmpty());
		nums.push(3);
		System.out.println(nums.isEmpty());
		nums.push(5);
		nums.push(1);
		nums.push(2);
		nums.push(7);
		
		System.out.println(nums.pop());
		System.out.println(nums.peek());
		nums.show();
		
	}

}
