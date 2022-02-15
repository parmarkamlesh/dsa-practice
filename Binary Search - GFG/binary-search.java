// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
             
            int key =sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr,n,key));
            T--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int binarysearch(int nums[], int n, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(nums[middle]==target){
                return middle;
            }else if(nums[middle]>target){
                end=middle-1;
            }else{
                start=middle+1;
            }
            
        }
        return -1;
    }
}