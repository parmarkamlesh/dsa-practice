// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);                
            }
        }
        ArrayList<Integer> op=new ArrayList();
         map.forEach((k,v) -> {
             if(v>1){
             op.add(k);
             }
             
         });
        Collections.sort(op);   
         if(op.size()==0)
            op.add(-1);
         return op;
            //  System.out.println("Key = "
            //     + k + ", Value = " + v));
    }
}
