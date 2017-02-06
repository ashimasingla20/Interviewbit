package tree;

import java.util.*;
/*Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
Example :


Given A : [1, 2, 3]
A height balanced BST  : 

     2
   /   \
  1     3 */

public class SortedArrayToBST {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public TreeNode sortedArrayToBST(final List<Integer> a) {
		int start =0;
		int end = a.size()-1;
		TreeNode root = BSThelper(a ,start,end);
		return root;
	}
    public TreeNode BSThelper(List<Integer> b,int start,int end){
    	int mid = (start+end)/2;
		if(start>end){
			return null;
		}
		int num = b.get(mid);
		TreeNode root = new TreeNode(num);
		root.left = BSThelper(b,start,mid-1);
		root.right = BSThelper(b,mid+1,end);
		return root;
	}

}
