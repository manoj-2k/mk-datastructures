package com.mk.sb.algos.trees.easy;

public class InvertBinaryTree {
	 public TreeNode invertTree(TreeNode root) {
	        if(root == null) return root;
	        invertNode(root);
	         return root;
	    }
	    
	    public void invertNode(TreeNode node){
	        if(node == null) return;
	        TreeNode temp = node.left;
	        node.left = node.right;
	        node.right = temp;
	        invertNode(node.left);
	        invertNode(node.right);
	    }
}
