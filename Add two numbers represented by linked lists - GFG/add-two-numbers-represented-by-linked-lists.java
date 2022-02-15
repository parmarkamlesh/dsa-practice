// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
        static Node reverseList(Node src){
        // ListNode safeHead=src;
        Node prev=null;
        Node current=src;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node l1, Node l2){
        
         Node rev1=reverseList(l1);
        Node rev2=reverseList(l2);
        
        Node safe1=rev1;
        Node safe2=rev2;
        
        Node outputMain=new Node(-1);
        Node output=outputMain;
        int carry=0;
        while(safe1!=null && safe2!=null){
                int num1=0;
                int num2=0;
                num1=safe1.data;
                num2=safe2.data;
                int sum=num1+num2+carry;

                if(sum>9){
                    carry=sum/10;
                    output.next=new Node(sum%10);                    
                }else{
                    output.next=new Node(sum);
                    carry=0;
                }

            output=output.next;
            safe1=safe1.next;
            safe2=safe2.next;                

        }
        while(safe1!=null){
            int temp=safe1.data+carry;
            if(temp>9){
               carry=temp/10;
               output.next=new Node(temp%10);                     
            }else{
               output.next=new Node(temp);          
                carry=0;
            }
            output=output.next;
            safe1=safe1.next;
        }
        while(safe2!=null){
        
            int temp=safe2.data+carry;
            
            if(temp>9){
               carry=temp/10;
               output.next=new Node(temp%10);                     
            }else{
               output.next=new Node(temp);                                     
                carry=0;
            }
            
            output=output.next;
            safe2=safe2.next;

        }
        if(carry>0){
            output.next=new Node(carry);                                     
            output=output.next;            
        }

        return reverseList(outputMain.next);
    }
}