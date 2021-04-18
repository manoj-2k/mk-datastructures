package com.mk.sb.algos.linkedlist.easy;

//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, 
//and return the new head.
// LC - 203
public class RemoveElement {
 
	public ListNode removeElements(ListNode head, int val) {
	    if(head == null) return head;
		ListNode prevNode = head;
	    ListNode curNode = prevNode.next;
		while(curNode !=null) {			
			if(curNode.val == val) {
				//remove this node
				prevNode.next = curNode.next;
			}else {
				prevNode = curNode;
			}
			curNode = curNode.next;
		}
		
		return head.val == val? head.next : head;
	    }
}
