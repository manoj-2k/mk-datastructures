package com.mk.sb.algos.numbers.easy;

import java.util.*;

//Return the smallest sorted list of ranges that cover all the numbers in the array exactly. 
//That is, each element of nums is covered by exactly one of the ranges, 
//and there is no integer x such that x is in one of the ranges but not in nums.
//LC - 228
public class SummaryRanges {

	public static void main(String[] args) {
		int[] nums = {0,2,3,4,6,8,9};
		List<String> ranges =  summaryRanges(nums);
		System.out.println(ranges);
	}
	
	  public static List<String> summaryRanges(int[] nums) {
		  List<String> ranges =  new ArrayList<String>();
		  if(nums ==null || nums.length <1) return ranges;
		  int begin = nums[0];
		  int end = begin;
		  for(int i=1; i<nums.length; i++) {
			  if(nums[i]- end == 1) {
				  end++;
			  }else {
				  if(nums[i] == end) {
					  while(i<nums.length && nums[i] == end) {
						  i++;
					  }
				  }
				  ranges.add(getRange(begin,end));
				  begin= nums[i];
				  end = begin;
			  }
		  }	  
		  ranges.add(getRange(begin,end));
		  return ranges;
	    }
	  
	  public static String getRange(int begin, int end) {
		  StringBuilder sb = new StringBuilder();
		  if(begin == end) { sb.append(begin);}
		  else {sb.append(begin).append("->").append(end);}
		  return sb.toString();
	  }
}
