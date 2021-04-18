package com.mk.sb.algos.numbers.easy;

import java.util.*;
//LC 13
public class RomantoInteger {

	public static void main(String[] args) {
		RomantoInteger ri = new RomantoInteger();
		System.out.println(ri.romanToInt("XIV"));
		System.out.println(ri.romanToInt("XV"));
		System.out.println(ri.romanToInt("IV"));
	}
	
	public int romanToInt(String s) {
		Map<Character, Integer> rMap = new HashMap<Character, Integer>();
		rMap.put('I', 1);
		rMap.put('V', 5);
		rMap.put('X', 10);
		rMap.put('L', 50);
		rMap.put('C', 100);
		rMap.put('D', 500);
		rMap.put('M', 1000);
		int i = 0;
		int prev = Integer.MAX_VALUE;
		int count = 0;
		while(i < s.length()) {
			int x = rMap.get(s.charAt(i));
			if(x > prev){
				count = count + x - 2* prev ;
			}else {
				count = count + x;
			}
			prev = x;
			i++;
		}
		
		return count;
    }
}
