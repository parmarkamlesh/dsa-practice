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
    ListNode reverseList(ListNode src){
        // ListNode safeHead=src;
        ListNode prev=null;
        ListNode current=src;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
           
            
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        ListNode rev1=l1;//reverseList(l1);
        ListNode rev2=l2;//reverseList(l2);
        
        ListNode safe1=rev1;
        ListNode safe2=rev2;
        
        ListNode outputMain=new ListNode();
        ListNode output=outputMain;
        int carry=0;
        while(safe1!=null && safe2!=null){
                int num1=0;
                int num2=0;
                num1=safe1.val;
                num2=safe2.val;
                int sum=num1+num2+carry;

                if(sum>9){
                    carry=sum/10;
                    output.next=new ListNode(sum%10,null);                    
                }else{
                    output.next=new ListNode(sum,null);
                    carry=0;
                }

            output=output.next;
            safe1=safe1.next;
            safe2=safe2.next;                

        }
        while(safe1!=null){
            int temp=safe1.val+carry;
            if(temp>9){
               carry=temp/10;
               output.next=new ListNode(temp%10,null);                     
            }else{
               output.next=new ListNode(temp,null);          
                carry=0;
            }
            output=output.next;
            safe1=safe1.next;
        }
        while(safe2!=null){
        
            int temp=safe2.val+carry;
            
            if(temp>9){
               carry=temp/10;
               output.next=new ListNode(temp%10,null);                     
            }else{
               output.next=new ListNode(temp,null);                                     
                carry=0;
            }
            
            output=output.next;
            safe2=safe2.next;

        }
        if(carry>0){
            output.next=new ListNode(carry,null);                                     
            output=output.next;            
        }

        return outputMain.next;

    }
}