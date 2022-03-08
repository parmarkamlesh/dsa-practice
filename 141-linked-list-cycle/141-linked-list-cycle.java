/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode fastp = head;
       ListNode slowp = head;
       while( fastp != null &&  fastp.next != null){
            
            slowp=slowp.next;
            fastp=fastp.next.next;
       
            if(slowp == fastp){
                return true;                
            }

       }
        return false;
    }
}