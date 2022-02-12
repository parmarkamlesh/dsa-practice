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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
     ListNode safe1=list1;
     ListNode safe2=list2;
     int counter=0;

        //l1 starting and l1 ending save
        ListNode l1start=null,l1end=null;
        while(safe1!=null){
            if(counter+1==a){
                //saving start pos to detach list
                l1start=safe1;
            }
            if(counter==b){
                //saving end position to detach list
                l1end=safe1.next;
            }
            safe1=safe1.next;
            counter++;
        }
        l1start.next=list2;
        ListNode safeJoin=l1start;
        while(safeJoin.next!=null){
            safeJoin=safeJoin.next;
        }
        safeJoin.next=l1end;
    return list1;      
    }
}