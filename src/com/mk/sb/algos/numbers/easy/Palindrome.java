package com.mk.sb.algos.numbers.easy;

//Given an integer x, return true if x is palindrome integer.
//LC 9
public class Palindrome {
	
	 public boolean isPalindrome(int x) {
		 if(x < 0) return false;
		 String s = Integer.toString(x);
		 int i = 0;
		 int j = s.length() -1;
		 while(i < j) {
			 if(s.charAt(i) != s.charAt(j))
				 return false;
			 i++;
			 j--;
		 }
		 
		 return true;
	 }
}
