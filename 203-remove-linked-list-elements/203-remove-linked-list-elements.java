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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode safeHead=head;
        
        while(safeHead!=null && safeHead.next!=null){
            if(safeHead.next.val==val){
               // safeHead.val=safeHead.val;
                safeHead.next=safeHead.next.next;                
            }else
            safeHead=safeHead.next;
        
        }
        
        if(head.val==val){
            head=head.next;
        }
        
        return head;
    }
}