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
    ListNode reverse(ListNode head){
     ListNode next,prev,current;
        prev=null;
        current=head;
        next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
        
    }
    ListNode midFind(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        //safe pointer not needed. returning boolean
        ListNode mid=midFind(head);
        ListNode endHalfRev=reverse(mid);

        while(endHalfRev!=null){
            if(head.val!=endHalfRev.val){
                return false;
            }
            head=head.next;
            endHalfRev=endHalfRev.next;
        }

        return true;
    }
}