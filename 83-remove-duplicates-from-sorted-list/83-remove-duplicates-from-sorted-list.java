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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode safe=head;
        
        while(safe!=null){
        
            if(safe.next!=null){

                if(safe.next.val==safe.val){
            
                    safe.next=safe.next.next;
                    continue;
                
                }

            }
            
            safe=safe.next;

        }
        return head;
    }
}