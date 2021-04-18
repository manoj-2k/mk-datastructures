package com.mk.sb.algos.arrays.easy;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(rd.removeDuplicates(nums));
		
	}
	
	
	 public int removeDuplicates(int[] nums) {
		 if(nums == null || nums.length <1) return 0;
	     int i = 0;
	     int j = 1;
	     while(j < nums.length) {
	    	 if(nums[i] != nums[j]) {
	    		 i++;
	    		 nums[i] = nums[j];
	    	 }
	    	 j++;
	     }
	     return i +1;
	    }
}
