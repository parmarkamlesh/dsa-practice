/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        
        ListNode safeHead=head;
        ListNode slow=safeHead;
        ListNode fast=safeHead;
        ListNode prev=null;
        ListNode nextNode=null;
        


        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
            nextNode=slow;
        }
        if(prev!=null && prev.next!=null){
            prev.next=prev.next.next;
        }

        return safeHead;
        
    }
}