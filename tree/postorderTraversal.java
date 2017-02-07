package tree;
/*Given a binary tree, return the postorder traversal of its nodes’ values.

Example :

Given binary tree

   1
    \
     2
    /
   3
return [3,2,1].*/

import java.util.ArrayList;
import java.util.Stack;

public class postorderTraversal {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
		Stack <TreeNode> stack1 = new Stack <TreeNode>();
		Stack <TreeNode> stack2 = new Stack <TreeNode>();
	    ArrayList <Integer> arr = new ArrayList <Integer>();
	    stack1.push(a);
		while(!stack1.isEmpty()){
			TreeNode ele = stack1.pop();
		    stack2.push(ele);
		    if(ele.left!=null){
		        stack1.push(ele.left);
		    }
		    if(ele.right!=null){
		        stack1.push(ele.right);
		    }
		    
		}
		while(!stack2.isEmpty()){
			TreeNode ele = stack2.pop();
		    arr.add(ele.val);
		}
		return arr;
	}
}
