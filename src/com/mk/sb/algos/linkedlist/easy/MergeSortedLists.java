package com.mk.sb.algos.linkedlist.easy;

public class MergeSortedLists {

	
	public static void main(String[] args) {
		MergeSortedLists ms = new MergeSortedLists();
		ListNode l1 = new ListNode(-9, new ListNode(3));
		ListNode l2 = new ListNode(5, new ListNode(7));
		ListNode mList = ms.mergeTwoLists(l1, l2);
		while(mList != null) {
			System.out.println(mList.val);
			mList = mList.next;
		}		
		
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) return null;
		ListNode m = new ListNode();
		ListNode mNext = m;
		while(l1 != null & l2 != null) {
			if(l1.val <= l2.val) {
				mNext.next = l1;
				l1 = l1.next;
			}else {
				mNext.next = l2;
				l2 = l2.next;
			}
			mNext = mNext.next;
		}
		ListNode r = l1 == null? l2 : l1;
		mNext .next = r;
		return m.next;
	}
	
	public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) return null;
		ListNode first = l1;
		ListNode second = l2;
		ListNode mergedList = new ListNode();
		ListNode mNext = mergedList;
		while(first != null && second != null) {
			if(first.val <= second.val) {
				mNext.val = first.val;
				first = first.next;
			}else {
				mNext.val = second.val;
				second = second.next;
			}
			mNext.next = new ListNode();
			mNext = mNext.next;
		}
		ListNode r = first == null? second : first;
		while(r != null) {
			mNext.val = r.val;
			if(r.next != null) {
			mNext.next = new ListNode();
			mNext = mNext.next;
			}
			r = r.next;
		}
		
		return mergedList;
    }
}
