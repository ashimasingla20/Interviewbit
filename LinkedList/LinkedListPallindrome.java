package LinkedList;
//https://www.interviewbit.com/problems/palindrome-list/
public class LinkedListPallindrome {
	class ListNode {
		public int val;
		public ListNode next;
		ListNode(int x) { val = x; next = null; }
	}
	public static ListNode reverse(ListNode secondHalf){
        ListNode prev = null;
        ListNode next = null;
        ListNode current = secondHalf;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current= next;
        
        }
        secondHalf= prev;
        return secondHalf;
    }
    public int compareList(ListNode first,ListNode second){
        while(first!=null && second!=null){
            if(first.val == second.val){
                first = first.next;
                second = second.next;
            }
            else{
                return 0;
            }
        }
        if(first==null && second==null){
            return 1;
        }
        return 0;
    }
    public int lPalin(ListNode A) {
        ListNode head=A;
        ListNode fastptr= head;
        ListNode slowptr = head;
        ListNode midpoint = head;
        //Listnode firstHalf = slowptr;
        //ListNode midpoint = null;
        ListNode slowptrprev = head;
        int res;
        if(head.next==null){
            return 1;
        }
        while(fastptr!=null && fastptr.next!=null){
            fastptr = fastptr.next.next;
            slowptrprev= slowptr;
            slowptr = slowptr.next;
            
        }
        if(fastptr!=null){
            midpoint = slowptr;
            slowptr = slowptr.next;
            
        }
        slowptrprev.next = null;
        ListNode secondHalf = slowptr;
        secondHalf = reverse(slowptr);
        res = compareList(head,secondHalf);
        return res;
        
    }

}
