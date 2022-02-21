// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int size)
    {
        if(size==1)
            return nums[0];

        Arrays.sort(nums);

        int howManyTime=size/2;
        howManyTime+=1;
        
        int counter=1;
        
        for(int i=0;i<size-1;i++){
        
            if(nums[i]==nums[i+1]){
                counter++;
                if(counter>=howManyTime){
                    return nums[i];
                }
            }else{
                counter=1;
            }

        }
        return -1;
    }
}