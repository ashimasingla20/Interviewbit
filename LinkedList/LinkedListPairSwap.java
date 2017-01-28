package LinkedList;


public class LinkedListPairSwap {
	 static ListNode head;
	 
	 class ListNode
	    {
	        int val;
	        ListNode next;
	        ListNode(int d) {val = d; next = null; }
	        public String toString(){
	    		return ""+val;
	    	}
	    }
	 
	    /* Function to pairwise swap elements of a linked list.
	     It returns head of the modified list, so return value
	     of this node must be assigned */
	    public ListNode pairSwap(ListNode head){
			ListNode temp=head;
			
			while(temp!=null && temp.next!=null){
				int k = temp.val;
				temp.val = temp.next.val;
				temp.next.val = k;
				temp = temp.next.next;
			}
			return head;
			
		}
}