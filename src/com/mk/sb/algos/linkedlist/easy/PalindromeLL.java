package com.mk.sb.algos.linkedlist.easy;

import java.util.*;

public class PalindromeLL {

	public static void main(String[] args) {

	}

	public boolean isPalindrome1(ListNode head) {
		Stack<Integer> stack = new Stack<Integer>();

		ListNode n = head;
		while (n != null) {
			stack.push(n.val);
			n = n.next;
		}
		n = head;
		while (n != null) {
			if (n.val != stack.pop())
				return false;
			n = n.next;
		}
		return true;
	}

	public boolean isPalindrome(ListNode head) {
		List<Integer> stack = new LinkedList<Integer>();
		ListNode n = head;
		while (n != null) {
			stack.add(n.val);
			n = n.next;
		}
		int begin = 0;
		int end = stack.size();
		while(begin < end) {
			if(stack.get(begin) != stack.get(end)) return false;
			begin++;
			end--;
		}
		return true;
	}
}
