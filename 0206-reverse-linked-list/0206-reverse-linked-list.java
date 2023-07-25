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