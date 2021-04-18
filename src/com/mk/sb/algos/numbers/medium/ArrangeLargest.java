package com.mk.sb.algos.numbers.medium;

import java.util.*;

public class ArrangeLargest {
	
	 private class LNComparator implements Comparator<String> {
	        public int compare(String a, String b) {
	        	StringBuilder sb1 = new StringBuilder().append(a).append(b);
	        	StringBuilder sb2 = new StringBuilder().append(b).append(a);
	           return sb2.compareTo(sb1);
	        }
	    }
	
	public static void main(String[] args) {
		ArrangeLargest al = new ArrangeLargest();
		int[] nums = {30,34,5,9,3};
	//	int[] nums = {111311, 1113};
		System.out.println(al.largestNumber(nums));
	}

	
	 public String largestNumber(int[] nums) {
	     String[] numStr = new String[nums.length];
	     for(int i=0;i<nums.length;i++) {
	    	 numStr[i] = String.valueOf(nums[i]);
	     }	  
	     System.out.println(Arrays.toString(numStr));
	     Arrays.sort(numStr, new LNComparator());
	     if (numStr[0].equals("0")) {
	            return "0";
	        }
	     System.out.println(Arrays.toString(numStr));
	     StringBuilder sb = new StringBuilder();
	     for(String s :numStr) {
	    	 sb.append(s);
	     }
		 return sb.toString();
	 }
	 

	 
}
