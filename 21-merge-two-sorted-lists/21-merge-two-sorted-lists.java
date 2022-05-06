class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first=list1;
        ListNode second=list2;

        ListNode output=new ListNode();
        ListNode OpTail=output;
        
        while(first!=null && second!=null){
        
            if(first.val<second.val){
            
                OpTail.next=first;
                first=first.next;

            }else{
            
                OpTail.next=second;
                second=second.next;                

            }
            
            OpTail=OpTail.next;
        }
        
        if(first!=null){
            OpTail.next=first;            
        }

        if(second!=null){
            OpTail.next=second;            
        }
        
        return output.next;
    }
}
