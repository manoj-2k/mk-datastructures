package com.mk.sb.algos.numbers.easy;

//Count the number of prime numbers less than a non-negative number, n.
//LC - 204

import java.util.*;
public class CountPrimes {
	
	
	public static void main(String[] args) {
		countPrimes(10);
	}
	
	public static int countPrimes(int n) {
		List<Integer> primes = new ArrayList<Integer>();
	int k = (n - 2)/2;
	boolean[] plist = new boolean[k+1];
	for(int i= 0; i < plist.length; i++)
		plist[i] = true;
	 for(int i = 1; i < k+1; i++) {
		 int j = i;
		 while(i+j+2*i*j <= k) {
			 plist[i+j+2*i*j] = false;
			 j++;
		 }
	 }
	 for(int i = 0 ; i < k +1; i++) {
		 if(plist[i]) {
			 primes.add(i);
		 }
	 }
	 System.out.println(primes);
		return 0;
	
	}
	
	public boolean isPrime(int n ) {
		
		return false;
	}
}
