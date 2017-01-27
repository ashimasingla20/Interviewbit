package LinkedList;

import LinkedList.LinkedListPallindrome.ListNode;

public class PallindromeRecursion {
	ListNode head;
	class ListNode{
		int val;
		ListNode next;
		ListNode(int d){
			val=d;
			next = null;
		}
	}
	public boolean isPallindromeUtil(ListNode right){
		ListNode left = right;
		boolean res = false;
		if(right==null){
			return true;
		}
		isPallindromeUtil(right.next);
		if(right.val==left.val){
			res = true;
		}else{
			res = false;
		}
		left = left.next;
		return res;
		
		
	}
	public boolean isPallindrome(ListNode head){
		boolean res = isPallindromeUtil(head);
		return res;
	}
	public void push(int new_data)
	{
	        /* Allocate the Node &
	           Put in the data */
	        ListNode new_node = new ListNode(new_data);
	 
	        /* link the old list off the new one */
	        new_node.next = head;
	 
	        /* Move the head to point to new Node */
	        head = new_node;
	  }
	public static void main(String args[]){
		PallindromeRecursion pr = new PallindromeRecursion();
		pr.push(1);
		pr.push(2);
		pr.push(3);
		Boolean res = pr.isPallindrome(pr.head);
		System.out.println(res);
	}

}
