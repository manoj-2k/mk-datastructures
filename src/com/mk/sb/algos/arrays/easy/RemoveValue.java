package com.mk.sb.algos.arrays.easy;

import java.util.Arrays;

//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
// LC 27
public class RemoveValue {
	
	public static void main(String[] args) {
		RemoveValue rv = new RemoveValue();
		int[] nums = {4,5};
		//int[] nums = {2,3};
		System.out.println(rv.removeElement(nums, 4));
	}

	public int removeElement(int[] nums, int val) {
		int i = 0;
		int j = nums.length;
		while(i < j) {
			if(nums[i] == val) {
				nums[i] = nums[j-1];
				j--;
			}else {
				i++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return i;
	}
}
