package tree;
/*Given a binary tree, return the preorder traversal of its nodes’ values.

Example :
Given binary tree

   1
    \
     2
    /
   3
return [1,2,3].

Using recursion is not allowed.*/
import java.util.ArrayList;
import java.util.Stack;

public class preorderTraversal {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(a == null){
        	return arr;
        }
        stack.push(a);
        while(!stack.isEmpty()){
    	    TreeNode ele = stack.pop();
            arr.add(ele.val);
            if(ele.right!=null){
               stack.push(ele.right);
           }
            if(ele.left!=null){
                 stack.push(ele.left);
            }
        }
        return arr;
	}

}
