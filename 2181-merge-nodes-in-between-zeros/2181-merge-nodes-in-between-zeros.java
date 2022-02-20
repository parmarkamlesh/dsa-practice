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
    public ListNode mergeNodes(ListNode head) {
        ListNode safe=head;
        ListNode op=new ListNode(-1);
        ListNode dum=op;
        while(safe!=null){
            if(safe.val==0){
                safe=safe.next;
                continue;
            }else{
              //[0,3,1,0,4,5,2,0]
            int counter=0;
            int sum=0;
                ListNode curToStoreSum=safe;
                while(safe.val!=0){
                    counter++;
                    sum+=safe.val;
                    safe=safe.next;
                }
                if(counter>1){
                    curToStoreSum.val=sum;
                   dum.next=new ListNode(sum);                    
                   dum=dum.next;
                    curToStoreSum.next=safe.next;
                    safe=curToStoreSum.next;
                }else{
                    
                   dum.next=new ListNode(curToStoreSum.val);
                   dum=dum.next;
                    safe=safe.next; 
                }
            }
        }
        return op.next;
    }
}