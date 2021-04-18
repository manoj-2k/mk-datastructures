package com.mk.sb.algos.numbers.easy;

//Given an integer n, return true if it is a power of two. Otherwise, return false.
//LC 231
public class PowerofTwo {

	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(5));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwo(18));
	}
	
	 public static boolean isPowerOfTwo(int n) {
		 if(n <= 0) return false;
	     while(n > 1) {
	    	if(n%2 != 0) return false;
	    	n = n/2;
	     }
		 return true;
	    }
}
