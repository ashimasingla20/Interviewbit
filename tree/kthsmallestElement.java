package tree;

import java.util.Stack;

/*
Given a binary search tree, write a function to find the kth smallest element in the tree.
Example :
Input : 
  2
 / \
1   3
and k = 2
Return : 2
As 2 is the second smallest element in the tree.
 NOTE : You may assume 1 <= k <= Total number of nodes in BST 
 
https://www.interviewbit.com/problems/kth-smallest-element-in-tree/
*/

public class kthsmallestElement {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public int kthsmallest(TreeNode root, int k) {
		Stack <TreeNode> stack = new Stack<TreeNode>();
	    TreeNode p = root;
	    while(p!=null || !stack.isEmpty()){
	    	if(p!=null){
	    		stack.push(p);
	            p = p.left;
	        }else{
	        	TreeNode ele = stack.pop();
	            k--;
	            if(k==0){
	            	return ele.val;
	            }
	            p = ele.right;
	         }
	     }
	     return root.val;
	}
}
