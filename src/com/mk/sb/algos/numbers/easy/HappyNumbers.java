package com.mk.sb.algos.numbers.easy;

import java.util.*;

//A happy number is a number defined by the following process:

//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
// LC - 202


public class HappyNumbers {

	public static void main(String[] args) {
		System.out.println(isHappy(1111111));

	}
	
	 public static boolean isHappy(int n) {		 
		 Set<Integer> runList = new HashSet<Integer>();		
		 while(n > 1) {			 
			 n = sumOfSquares(n);
			 if(runList.contains(n)) {
				 break;
			 }else {
				 runList.add(n);
			 }
		 }		 
		 return n == 1;	        
	    }
	 
	 public static int sumOfSquares(int n) {
		 int sum =0;
		 int r = 0;
		 while(n >= 10) {
			 r = n%10;
			 sum = sum + r*r;
			 n = n/10;
		 }
		 return (sum + n*n);
	 }

}
