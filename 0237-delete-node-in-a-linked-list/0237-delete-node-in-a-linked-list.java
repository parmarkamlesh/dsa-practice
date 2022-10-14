/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nx=node.next;
        node.val=nx.val;
        node.next=nx.next;
        nx.next=null;
        
    }
}