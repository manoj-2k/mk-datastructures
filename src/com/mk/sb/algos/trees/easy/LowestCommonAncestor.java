package com.mk.sb.algos.trees.easy;

//Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
//LC 235
public class LowestCommonAncestor {

	
	public static void main(String[] args) {
		//[6,2,8,0,4,7,9,null,null,3,5]
		
		TreeNode n1 = new TreeNode(4,new TreeNode(3), new TreeNode(5));
		TreeNode n2 = new TreeNode(2, new TreeNode(0),n1);
		TreeNode n3 = new TreeNode(8, new TreeNode(7), new TreeNode(9));
		TreeNode root = new TreeNode(6,n2,n3);
		LowestCommonAncestor lca = new LowestCommonAncestor();
		TreeNode n = lca.lowestCommonAncestor(root, n2, n1);
		System.out.println(n.val);
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if((root.val >= p.val && root.val <= q.val) || (root.val >= q.val && root.val <= p.val))
			return root;
		if(p.val < root.val) {
			return lowestCommonAncestor(root.left,p,q);
		}else  {
			return lowestCommonAncestor(root.right, p, q);
		}
    }
}
