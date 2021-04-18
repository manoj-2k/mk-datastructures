package com.mk.sb.algos.strings.easy;

import java.util.*;

public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("foo","bar"));
		System.out.println(isIsomorphic("egg","add"));
		System.out.println(isIsomorphic("bada","baba"));

	}
	
	 public static boolean isIsomorphic(String s, String t) {
	     if(s == null || t == null || s.length() != t.length()) return false;
	     Map<Character,Character> replaceMap = new HashMap<Character,Character>();
	     Set<Character> set = new HashSet<Character>();
	     for(int i =0; i <s.length(); i++) {
	    	 if(replaceMap.containsKey(s.charAt(i))){
	    		 if(t.charAt(i) != replaceMap.get(s.charAt(i))) {
	    			 return false;
	    		 }
	    	 }else {
	    		 if(set.contains(t.charAt(i))) return false;
	    		 replaceMap.put(s.charAt(i), t.charAt(i));
	    		 set.add(t.charAt(i));
	    	 }
	     }	
	    
		 return true;
	    }

}
