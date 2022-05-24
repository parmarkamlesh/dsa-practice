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
    public boolean hasCycle(ListNode h) {
       ListNode f = h;
       ListNode s = h;
       while( f != null &&  f.next != null){
            s=s.next;
            f=f.next.next;
       
            if(s == f){
                return true;                
            }

       }
        return false;
//        ListNode fastp = head;
//        ListNode slowp = head;
//        while( fastp != null &&  fastp.next != null){
            
//             slowp=slowp.next;
//             fastp=fastp.next.next;
       
//             if(slowp == fastp){
//                 return true;                
//             }

//        }
//         return false;
    }
}
