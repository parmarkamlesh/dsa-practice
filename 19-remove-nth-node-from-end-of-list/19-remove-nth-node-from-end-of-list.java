class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode safeHead=head;
        ListNode slow=head;
        ListNode fast=head;
        int i=0;
        while(i<n){
            fast=fast.next;
            i++;
        }
        if(fast==null){
            return head.next;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return safeHead;
    }
}
