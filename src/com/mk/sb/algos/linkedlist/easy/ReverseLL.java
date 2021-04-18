package com.mk.sb.algos.linkedlist.easy;

//Given the head of a singly linked list, reverse the list, and return the reversed list.
//LC 206
public class ReverseLL {

	 public ListNode reverseList(ListNode head) {
		  if(head == null) return head;		     
		 ListNode curNode = head;
		 ListNode nextNode = head.next;
		 while(nextNode != null) {
			 ListNode temp = nextNode.next;
			 nextNode.next = curNode;
			 curNode = nextNode;
			 nextNode = temp;
		 }
		 head.next = null;
		 return curNode;
	    }
	
}
