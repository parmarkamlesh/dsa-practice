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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0)
            return head;
        if (head == null) return null;
        if (head.next == null) return head;
        int n=1;
        ListNode oldTail = head;
        
        while ( oldTail.next != null) {
            oldTail = oldTail.next;
            n++;
        }
    //    System.out.println(n);
        oldTail.next = head;
        ListNode newTail=head;
        for(int i=0;i<( n - k % n - 1);i++){
            // System.out.println(newTail.val);
           newTail=newTail.next; 
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}