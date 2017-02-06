package tree;

public class SymmetricTree {
	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	public int isMirror(TreeNode a,TreeNode b){
        if(a==null && b==null){
            return 1;
        }
        if(a!=null && b!=null && a.val==b.val){
            if(isMirror(a.left,b.right)==1 && isMirror(b.left,a.right)==1){
                return 1;
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }
	public int isSymmetric(TreeNode a) {
	    return isMirror(a,a);
	}
}
