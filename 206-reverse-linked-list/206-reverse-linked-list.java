
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode safeHead=head;
        ListNode prev=null;
        ListNode current=safeHead;
        ListNode next=safeHead.next;
        
        while(current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null)
                next=next.next;
            
        }
        head=prev;
        return head;
        
    }
}
