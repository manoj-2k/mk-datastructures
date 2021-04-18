package com.mk.sb.algos.strings.easy;

import java.util.Arrays;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//LC 242
public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidAnagram va = new ValidAnagram();
		System.out.println(va.isAnagram("anagram", "nagaram"));

	}
	 public boolean isAnagram1(String s, String t) {
	        if(s.length() != t.length() )return false;
	       char[] sChars = s.toCharArray();
		        char[] tChars = t.toCharArray();
		        Arrays.sort(sChars);		        
		        Arrays.sort(tChars);
		        for(int i = 0; i<sChars.length; i++) {
		        	if(sChars[i] != tChars[i]) {
		        		return false;
		        	}
		        }
			  
			  return true; 
	    }
	 public boolean isAnagram(String s, String t) {
	       if(s.length() != t.length() )return false;
	       int[] chars = new int[256];
	       for(char c : s.toCharArray()) {
	    	   chars[c]++;
	       }
	       for(char c : t.toCharArray()) {
	    	   chars[c]--;
	       }
	       for(int count: chars) {
	    	   if(count > 0) return false;
	       }  
			  return true; 
	    }
}
