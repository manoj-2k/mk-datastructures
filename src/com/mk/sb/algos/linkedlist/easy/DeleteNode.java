package com.mk.sb.algos.linkedlist.easy;

//Write a function to delete a node in a singly-linked list. 
//You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
//LC - 237
public class DeleteNode {

	
	 public void deleteNode(ListNode node) {
		 ListNode curNode= node;
	     ListNode nextNode = curNode.next;
	     ListNode prevNode = curNode;
		 while(nextNode !=null ) {
			int temp = curNode.val;
			curNode.val = nextNode.val;
			nextNode.val = temp;
			prevNode = curNode;
			curNode = curNode.next;
	            nextNode = nextNode.next;
			 }
	        prevNode.next = null;
	  }
}
