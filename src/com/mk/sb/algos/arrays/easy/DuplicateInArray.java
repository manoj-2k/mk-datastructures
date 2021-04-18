package com.mk.sb.algos.arrays.easy;

import java.util.*;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//LC - 217, 219
public class DuplicateInArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		//System.out.println(containsDuplicate(nums));
		System.out.println(containsNearbyDuplicate(nums,3));

	}
	
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> nList = new HashSet<Integer>();
		 for(int i=0; i < nums.length; i++) {
			 if(nList.contains(nums[i])) return true;
			 nList.add(nums[i]);
			 System.out.println(nList);
		 }
		 return false;
	    }
	//Given an integer array nums and an integer k, 
	//return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {	 
		 Map<Integer,Integer> iMap = new HashMap<Integer,Integer>();
		 for(int i=0; i < nums.length; i++) {	
			 if(iMap.containsKey(nums[i]) && Math.abs(iMap.get(nums[i]) - i) <=k)return true;
			 iMap.put(nums[i], i);
		 }		 
		 return false;
	 }

}

;